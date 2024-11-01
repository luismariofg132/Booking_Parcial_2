/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionListener;
import Views.MainPlane;
import Logic.Plane;

/**
 *
 * @author lmfg0
 */
public class PlaneController{
    MainPlane viewPlane;
    Plane logicPlane;

    public PlaneController(MainPlane viewPlane, Plane logicPlane) {
        this.viewPlane = viewPlane;
        this.logicPlane = logicPlane;
    }
    
    public void init(){
        viewPlane.setTitle(" BOOKING ");
        viewPlane.setVisible(true);
        viewPlane.setLocationRelativeTo(viewPlane);
    }
    
    
}
