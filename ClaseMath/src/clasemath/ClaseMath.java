/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

/**
 *
 * @author BREN
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raiz, cuadrado, base=5, exponente=2, aleatorio;//declaración de varible.
        int raiz2;
        float numero=5.7f;
        int redondeo;
        
        raiz = Math.sqrt(9); //raiz cuadrada de 9.
        raiz2= (int)Math.sqrt(9);// raiz cuadrada de 9 pero en entero.
        cuadrado = Math.pow(base,exponente); // se hará la operacion de 5 al cuadrado
        redondeo = Math.round(numero); //nos va a redondear el 5.7.
        aleatorio = Math.random();
        
        
        //Impresion de los datos.
        System.out.println("La raiz cuadra en double de 9 es: "+raiz);
        System.out.println("La raiz cuadra en entero de 9 es: "+raiz2);
        System.out.println("El cuadrado de 5 es: "+cuadrado);
        System.out.println("El redondeo de 5.7 es: "+redondeo);
        System.out.println("El numero aleatorio es: "+aleatorio);
        
        
          
        
        
        
        
    }
    
}
