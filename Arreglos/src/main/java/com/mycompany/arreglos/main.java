
package com.mycompany.arreglos;

import java.util.Scanner;


public class main {
    
    
    public static void main(String[] args) {
        
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del array");
        int tamano= entrada.nextInt();
        int[] numeros =new int[tamano];
        
        //Llenado el array de frutas
       for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero");
            numeros[i] = entrada.nextInt();
        }
        
       //Mostrar elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El elemento del array en la posición "+ i +" es: "+ numeros[i]);
        }
        
        
    }
    
}
