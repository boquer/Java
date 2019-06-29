/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author BREN
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //necesario para que puedan ser ingresados los datos
        
        int numero1, numero2,suma,resta,multi,divi,residuo; //declaracion de las variable de tipo entero
        
        //Las siguientes lineas son para que se queden guardados los datos que ingresó el usuario.
        System.out.print("Ingresa el primer valor: ");
        numero1 = entrada.nextInt(); //el primer valor se guarda en la variable "numero1"
        System.out.print("Ingrese el segundo valor: ");
        numero2 = entrada.nextInt();//La segunda variable se guarda en la variable "numero2"
        
        //Operaciones que se pueden realizar 
        suma = numero1 + numero2;// suma
        
        resta = numero1 - numero2;//resta
        
        multi = numero1 * numero2;//multiplicacion
        
        divi = numero1/numero2;//division
        
        residuo = numero1%numero2;//módulo
        
        //Impresio de los resultados
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
        System.out.println("El residuo de la division es: "+residuo);
        
    }
    
}
