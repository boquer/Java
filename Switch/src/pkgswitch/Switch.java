/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author BREN
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato; //Declaracion de variables.
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero del 1 al 5: "));//Se guarda el dato que ingresó el usuario.
        
        switch(dato)//La sentia depende del numero que ingresó el usario.
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Ingresaste en numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Ingresaste el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Ingresaste el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Ingresaste el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Ingresaste el numero 5");
            default:
                JOptionPane.showMessageDialog(null,"El numero que ingresaste no entra en la escala que se te pidio");
                break;
        }
    }
    
}
