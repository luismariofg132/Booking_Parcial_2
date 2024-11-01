/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasfinal;

import Views.MainPlane;
import Controller.PlaneController;
import Logic.Plane;


/**
 *
 * @author lmfg0
 */
public class ReservasFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Views
        MainPlane _main = new MainPlane(42, 8);
        
        // Logic
        Plane codigo = new Plane();

        // Controller
        PlaneController controller = new PlaneController(_main, codigo);
        
        controller.init();
    }
    
}
