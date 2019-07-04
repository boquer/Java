/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

    import javax.swing.JOptionPane;

/**
 *
 * @author BREN
 */
public class Sentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, dato=5; //Declaracion de variables
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: ")); //Seguardará el numero proporcionado por el usuario.
        
        if(numero ==dato)//si el numero que ingresó el usuario es igual a 5...
        {
            JOptionPane.showMessageDialog(null,"El numero que ingresaste es 5"); //Se imprime este dialogo y termina el programa (no pasa por el "else")
        }
        else //En caso contrario de que sea otro numero.
        {
            JOptionPane.showMessageDialog(null,"El numero que ingresaste es diferente de 5");//Se imprime este diaglo.
        }
 
    }
    
}
