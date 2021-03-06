/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syafiqrazak.decoration_package;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.ImageIcon;
/**
 *
 * @author SyafiqRazak
 */
public abstract class Decorator extends ImageView implements DecorationItem{
    protected DecorationItem decorationItem;
    
    public Decorator(DecorationItem decorationItem){
        this.decorationItem = decorationItem;
    }
    
    @Override
    public void selectDecoration() {
        decorationItem.selectDecoration();
    }
//    @Override
//    public void resize(double scale){
//        setFitHeight(scale);
//    }
    
    @Override
    public void rotate(double degree, DecorationItem di){
//        setRotate(degree);
    }
    
    @Override
    public void location(double slider, int length, String orientation, DecorationItem di){
        
    }
//    @Override
    public void setVisibility(boolean v, int length, DecorationItem di){
        System.out.println("Visibility set to " + v);
        setVisible(v);
    }
    
}
