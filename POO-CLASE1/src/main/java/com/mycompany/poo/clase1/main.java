
package com.mycompany.poo.clase1;


public class main {
    public static void main(String[] args) {
        Persona persona= new Persona();
       //creado una persona 
        persona.altura=12;
        persona.color="Morena";
        persona.nombre="Juan";
        persona.apellido="Loor";
        persona.edad=12;
        System.out.println(persona.nombre +" "+ persona.apellido);
        int hora=10;
        if(hora==10){
            persona.jugar();
        }
        if(hora==1){
           persona.comer();  
        }
        if(hora==11){
             persona.dormir();
        }
       
      
      Persona persona1= new Persona();
        //creado una persona 
        persona1.altura=15;
        persona1.color="Blanca";
        persona1.nombre="José";
        persona1.apellido="Vera";
        persona1.edad=200;
        System.out.println(persona1.nombre +" "+ persona1.apellido);
        persona1.comer();
    }
}
