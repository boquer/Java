/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author BREN
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i, contador;
        
        System.out.print("Ingrese cuantos digitos quiere: ");
        contador = entrada.nextInt();
        
        for(i=1; i<=contador; i++)
        {
            System.out.println(i);
        }
                
    }
    
}
