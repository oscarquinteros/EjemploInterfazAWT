/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

import java.awt.Frame;

/**
 *
 * @author oscarquinteros
 */
public class EjemploInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Frame f = new Frame("Primera Ventana");
//        f.setBounds(100, 100, 400, 250);
//        f.setVisible(true);
        Ventana v = new Ventana("Primera Ventana",100, 100, 400, 250);
        Ventana2 v2 = new Ventana2("");
        v2.addWindowListener(new GestionEventosVentana());
        v2.setVisible(true);
        
    }
    
}
