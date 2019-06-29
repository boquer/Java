/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author BREN
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        
        int numero1, numero2,suma;
        String nombre;
        
        System.out.print("Digita tu nombre: ");
        nombre = entrada.next();
       
        System.out.println("Buenos dias "+nombre);
        
        
        System.out.print("Ingrese el primer digito: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo digto: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("La suma de tus digitos es: "+suma);
        
    }
    
}
