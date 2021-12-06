/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tutoria01;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Usuario usuario = new Usuario();
        int op;
       do {
            System.out.println("1) ingresar");
            System.out.println("2) modificar");
            System.out.println("3) buscar");
            System.out.println("4) mostrar");
            System.out.println("5) salir");
            System.out.println("Seleccione una opcion");
            op=entrada.nextInt();
             entrada.nextLine();
            switch(op){
            case 1:
                  System.out.println("Ingrese un usuario");
                  String fusuario= entrada.nextLine();
                  System.out.println("Ingrese un password");
                  String fpassword= entrada.nextLine();
                  usuario.ingresar(fusuario,fpassword);
                  break;
            case 2:
                  System.out.println("Ingrese el usuario a modificar");
                  String user= entrada.nextLine();
                  System.out.println("Ingrese el nuevo usuario");
                  String usernew= entrada.nextLine();
                  System.out.println("Ingrese el nuevo password");
                  String passnew= entrada.nextLine();
                  usuario.modificar(user,usernew,passnew);
                  break;      
            case 3:
                  System.out.println("Ingrese el usuario a buscar");
                  String us= entrada.nextLine();
                  usuario.buscar(us);
                  break;
            case 4: 
                  usuario.mostrar();
                  break;      
        } 
           
       }while(op!=5);

    }
}
