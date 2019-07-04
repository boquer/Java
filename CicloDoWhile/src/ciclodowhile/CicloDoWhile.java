/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author BREN
 */
public class CicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i=1, contador;
        
        System.out.print("Ingresa cuantos digitos quieres: ");
        contador = entrada.nextInt(); //Se guarda el dato que ingresó el usario
        
        do{//Comienza el ciclo do While
            System.out.println(i);//Imprime el valor de i.
            i++;//Aunmenta el valor de i.
        }while(i<=contador);//Checa si es cierta la condición.
        
        
        
    }
    
}
