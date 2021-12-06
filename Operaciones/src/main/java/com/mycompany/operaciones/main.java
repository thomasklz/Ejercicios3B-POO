/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operaciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in); 
        Operaciones op= new Operaciones();
        
        // 1) suma
       // 2) resta
       // 3) multiplicación
       // 4) división
       
        System.out.println("Ingrese un numero");
        op.numero1=entrada.nextInt();
        System.out.println("Ingrese otro numero");
        op.numero2=entrada.nextInt();
        
        op.suma();
       // realizar un menú 
       
       // 1) suma
       // 2) resta
       // 3) multiplicación
       // 4) división
       
       // resta, multiplicación y división
       
    }
}
