/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author BREN
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i=1,contador; 
        
        System.out.print("Ingresa cuantos digitos quieres: ");
        contador = entrada.nextInt(); //Se guarda el numero que ingresó el usuario.
        
        while(i<=contador) //mientras que i sea menor o igual al numero que ingresó el usuario, ya van a ejecutar las siguientes lineas
        {
            System.out.println(i);//Se imprime cada valor de i.
            i++;//El valor de i va aumentando de uno en uno.
        }
        
        
        
        
    }
    
}
