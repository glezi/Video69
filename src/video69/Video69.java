/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video69;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author gleez
 */
public class Video69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoVentana mimacro=new MarcoVentana();  
        
        mimacro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MarcoVentana mimarco2 = new MarcoVentana(); 
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        mimacro.setTitle("Ventana 1"); 
        mimarco2.setTitle("Ventana2"); 
        
        mimacro.setBounds(300,300,500,350); 
        mimarco2.setBounds(900,300,500,350);
        
    }
    
}
class MarcoVentana extends JFrame{
    public MarcoVentana(){
       // setTitle("Respondiendo"); 
        //setBounds(300,300,500,350);
        setVisible(true);
    
       // M_Ventana oyente_ventana = new M_Ventana(); 
        
        //addWindowListener(oyente_ventana);
        
        addWindowListener(new M_Ventana());
    }
            
}

class M_Ventana extends WindowAdapter{
    
    public void windowIconified(WindowEvent e){
    System.out.println("Ventana Minimizada");
    }
    public void windowOpened(WindowEvent e){
    System.out.println("Ventana abierta");
    }
}