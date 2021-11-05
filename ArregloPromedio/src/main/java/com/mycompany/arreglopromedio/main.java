
package com.mycompany.arreglopromedio;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner(System.in);
        //Tamaño del array
        System.out.println("Ingrese el tamaño del array");
        int tamano=entrada.nextInt();
        //crear array con tamaño dinamico
        int notas[]= new int[tamano];
        int suma=0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese una nota");
            notas[i]=entrada.nextInt();
            suma=suma+notas[i];
        }
             
        System.out.println("El promedio es: "+ (suma/notas.length));
        
        
    }
}
