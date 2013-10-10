/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author oscarquinteros
 */
public class GestionEventoVentana2 extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }    
    public void windowIconified(WindowEvent e) {
//        System.out.println("Se activo windowIconified");
    }
    
}
