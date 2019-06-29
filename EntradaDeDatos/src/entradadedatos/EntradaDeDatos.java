/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedatos;

import java.util.Scanner; 

/**
 *
 * @author BREN
 */
public class EntradaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int dato; //tipo entero
        float dato2; //Tipo flotante
        char letra; //Tipo caracter
        String cadena; //tipo cadena
        String cadena1;
        
        System.out.print("Digite el dato entero que desea: "); //Mensaje que aparece en pantalla.
        dato = entrada.nextInt(); //se guarda el dato que ingreso el usuario, es Int porque es entero.
        
        System.out.print("Digite el dato flotante que desea: ");
        dato2 = entrada.nextFloat(); //se guarda el dato que ingreso el usuario, es Float porque es flotante.
        
        System.out.print("Ingrese la palabra que desea: ");
        cadena = entrada.next(); //se guarda la palabra que ingreso el usuario, es next porque es cadena.
        
        System.out.print("Ingrese el caracter que desea: ");
        letra = entrada.next().charAt(0); //se pone el 0 porque si ingresas una palabra que va a imprimir la primera leta.
        
        
       /* System.out.print("Ingrese la cadena que desea: ");
        cadena1 = entrada.nextLine(); //se guarda la cadena completa, por eso se le agrega el Line. */
        
        
        //Impresiones de todos los valores
        System.out.println("El numero entero que ingresaste es: "+dato);
        System.out.println("El dato flotante que ingresaste es: "+dato2);
        System.out.println("La palabra que ingresaste es: "+cadena);
        System.out.println("El caracter que ingresate es: "+letra);
        //System.out.println("La cadena que ingresaste es: "+cadena1);
        
        
    }
    
}
