/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author BREN
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de los arreglos.
        int[] numeros = {1,2,3};
        String[] numero = {"hola","mundo"};
        char[] letras = {'a','b','c','d'};
        int i,j,k;
        
        //Salida de cada uno de los arreglos
        System.out.println("::Arreglo de numeros enteros::");
        for(k=0; k<3; k++) //La k es el indice del arreglo.
        {
            System.out.println(numeros[k]);//Se imprime cada elemento del arreglo.
        }
        
        
        System.out.println("::Arreglo de cadenas::");
        for(i=0; i<2;i++)
        {
            System.out.println(numero[i]);
        }
        
        
        System.out.println("::Arreglo de caracteres::");
        for(j=0; j<4;j++)
        {
            System.out.println(letras[j]);
        }
    }
    
}
/*Recuerda que todos los arreglos siempre comienzan desde 0, supongamos que tenemos un arreglo de 3 elementos, por lo tanto su casillas tienen
la numeración de 0,1,2 y asi sucesivamente, es por eso que en TODOS los indices se comienza desde la posición 0. */