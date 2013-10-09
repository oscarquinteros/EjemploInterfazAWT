/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author oscarquinteros
 */
public class GestionEventosBoton implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Presiono el Boton");
    }
    
}
