/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaemergente;

import javax.swing.JOptionPane;

/**
 *
 * @author BREN
 */
public class VentanaEmergente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de las variables
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        //Las siguientes lienas son para que los datos se puedan guardar en la varible correspondiente.
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Ingrese la letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el decimal: "));
        
        //Impresion de los valores dados por el usuario.
       JOptionPane.showMessageDialog(null, "La cadena que ingreso es: "+cadena);
       JOptionPane.showMessageDialog(null,"El numero entero que ingreso es: "+entero);
       JOptionPane.showMessageDialog(null,"La letra que ingreso es: "+letra);
       JOptionPane.showMessageDialog(null,"El decimal que ingreso es: "+decimal);
          
       
        
        
        
       
        
    }
    
}
