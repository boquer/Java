/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author BREN
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Salida de datos
        System.out.println("Hola Mundo"); //prueba de comentario
        System.out.println("Prueba de impresion"); //despues del print hay un salto de linea, la letra "l" es una L minuscula, NO una "i" mayuscula.
        
        /* Prueba de 
        comentario de varias
        líneas
        */
        int numero,suma,numero2;
        float decimal = 45.89f;
        double decimal2;
        char caracter = 'D';
        boolean desicion = true;
        Integer nulo = null; //dato no primitivo 
        String palabra = "Hola"; //las cadenas son datos no primitivos 
        final int constante = 40; //definimos nuestra variables constante, si más adelnate la queremos cambiar no podremos y nos marcara error.
        
        //Dando valores a cada una de las variables.
        numero = 75;
        numero2 = 10;
        decimal2 = 746.985;
        
        //operacion de suma
        suma = numero + numero2;
       
        //Impresion de los datos
        System.out.println("La suma es: "+suma); //muestra el resultado de la suma
        System.out.println(":::Los siguientes numeros son primitivos:::");
        System.out.println("El numero que le diste a la variables es: "+numero);
        System.out.println("El numero decimal que ingresaste es: "+decimal);
        System.out.println("Otro numero decimal es: "+decimal2);
        System.out.println("El caracter que ingresaste es la letra: "+caracter);
        System.out.println("El boolean que diste es: "+desicion);
        System.out.println(":::Los siguientes son NO primitivos:::");
        System.out.println("El dato no primitivo es: "+nulo);
        System.out.println("La cadena que ingresaste es: "+palabra);
        System.out.println("El valor de tu variables constante es: "+constante);
    }
    
    
    
}
