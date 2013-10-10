/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author oscarquinteros
 */
public class Ventana extends Frame{
    Label jl1 = new Label("Nombre");
    Label jl2 = new Label("Apellido");
    TextField  text1 = new TextField("");
    TextField  text2 = new TextField("");
    Button bt1 = new Button("Ok");
    Button bt2 = new Button("Cancelar");    
    public Ventana(){
        super("Ingreso de Valores");
        Dimension dim_pantalla = Toolkit.getDefaultToolkit().getScreenSize();        
        this.setBounds(new Rectangle(250,150));    
        this.setLocation((dim_pantalla.width-new Rectangle(250,150).width)/2,(dim_pantalla.height-new Rectangle(250,150).height)/2);
        
        this.setLayout(new FlowLayout());        
        //this.setLayout(new BorderLayout());
        //this.setLayout(new GridLayout(2,4));
        
        Panel controles = new Panel(new FlowLayout());
        Panel ingresoDatos = new Panel(new GridLayout(2,2));
        this.add(ingresoDatos);
        this.add(controles);
        
        ingresoDatos.add(jl1);
        ingresoDatos.add(text1);
        ingresoDatos.add(jl2);        
        ingresoDatos.add(text2);                
        controles.add(bt1); //,BorderLayout.NORTH
        controles.add(bt2); //,BorderLayout.SOUTH
        
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,text1.getText(),"Valor Ingresado",JOptionPane.INFORMATION_MESSAGE);
            }
        });        
        
        this.addWindowListener(new GestionEventoVentana2());
        this.setVisible(true);
    }
}
