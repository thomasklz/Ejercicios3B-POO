
package com.mycompany.sumadearreglos;

import java.util.Scanner;


public class main {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] v1= new int[5];
        int[] v2= new int[5];
        int[] v3= new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero para el vector #1");
            v1[i]=entrada.nextInt();
        }
         for (int i = 0; i < v2.length; i++) {
            System.out.println("Ingrese un numero para el vector #2");
            v2[i]=entrada.nextInt();
        }
         
         for (int i = 0; i < 10; i++) {
            v3[i]= v1[i]+v2[i];
            System.out.println(v1[i]+ " + " + v2[i]+" = " +v3[i] );
        }
         
         
        
    }
}
