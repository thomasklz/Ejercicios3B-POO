
package com.mycompany.logrob;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Equipos clsEquipos = new Equipos();
        int op;

        do{
        
        System.out.println("1) Ingresar");
        System.out.println("2) Mostrar");
        System.out.println("3) Eliminar");
        System.out.println("5) Salir");
        System.out.println("Seleccione una opción");
        op= entrada.nextInt();
        switch(op){
            case 1:
                entrada.nextLine();
                System.out.println("Ingrese un nombre del equipo");
                clsEquipos.setNombreEquipo(entrada.nextLine()) ;
                
                boolean comprobrar= clsEquipos.validar();           
                if(comprobrar==true){
                    System.out.println("Equipos existente");
                }else{
                    System.out.println("Ingrese una fecha de creación");
                    clsEquipos.setFechaCreacion(entrada.nextLine());
                    System.out.println("Ingrese el nombre del presidente del equipo");
                    clsEquipos.setNombrePresidente(entrada.nextLine());
                    System.out.println("Ingrese el número de campeonatos ganados");
                    clsEquipos.setNumeroCampeonatos(entrada.nextInt()) ;
                    clsEquipos.ingresar();
                }
                break;
            case 2:
                clsEquipos.mostrar();
                break ;   
            case 3:
                clsEquipos.mostrar();
                System.out.println("Escriba el indice del equipo que desea eliminar");
                int indice = entrada.nextInt();
                clsEquipos.eliminar(indice);
             }
        
        }while(op!=5);
        
        
        
        
        
        
        
    }
}
