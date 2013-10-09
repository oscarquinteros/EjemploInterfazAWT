/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author oscarquinteros
 */
public class Ventana extends Frame{
    Button bt = new Button("");
    public Ventana(String titulo,int x,int y,int ancho,int alto){
        super(titulo);
        this.setBounds(x, y, alto, ancho);
        this.setLayout(null);
        bt.setBounds(50, 50, 100, 30);
        
//        bt.addActionListener(new GestionEventosBoton());
        
        
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Presiono el Boton");
            }
        });
        
        this.add(bt);
        this.addWindowListener(new GestionEventoVentana2());
        this.setVisible(true);
    }
}
