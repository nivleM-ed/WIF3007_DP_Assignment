/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syafiqrazak.decoration_package;

/**
 *
 * @author syafiqRazak
 */
public class DecorationRotation extends Decorator {
    public DecorationRotation(DecorationItem decorationItem) {
      super(decorationItem);	
//        setRotate(200);	
   }

    @Override
    public void rotate(double degree, DecorationItem di) {
        decorationItem.rotate(degree, di);
    }

    @Override
    public void resize(double arg0, DecorationItem arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    @Override
    public void setVisibility(boolean v, DecorationItem di) {
        System.out.println("Inside DecorationVisibility");
        decorationItem.setVisibility(v, di);
    }

    @Override
    public double getSize(DecorationItem di) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getXCoordinate(DecorationItem di) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getYCoordinate(DecorationItem di) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getRotation(DecorationItem di) {
        return di.getRotation(di);
    }

    @Override
    public boolean getVisibility(DecorationItem di) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
