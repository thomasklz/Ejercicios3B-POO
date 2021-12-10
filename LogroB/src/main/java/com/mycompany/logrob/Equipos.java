/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logrob;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Equipos {
   private String nombreEquipo, fechaCreacion, nombrePresidente;
   private int numeroCampeonatos;
   
    ArrayList<Equipos> arrayequipos = new ArrayList<>();
    public Equipos(String nombreEquipo, String fechaCreacion, String nombrePresidente, int numeroCampeonatos) {
        this.nombreEquipo = nombreEquipo;
        this.fechaCreacion = fechaCreacion;
        this.nombrePresidente = nombrePresidente;
        this.numeroCampeonatos = numeroCampeonatos;
    }
    
    public Equipos() {
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public int getNumeroCampeonatos() {
        return numeroCampeonatos;
    }

    public void setNumeroCampeonatos(int numeroCampeonatos) {
        this.numeroCampeonatos = numeroCampeonatos;
    }
  
     public boolean validar(){
        boolean bandera=false;
        for (int i = 0; i < this.arrayequipos.size(); i++) {
            if(this.nombreEquipo.equals(this.arrayequipos.get(i).nombreEquipo)){ 
               bandera=true;
            }   
        }
         return bandera;
     }
     
    public void ingresar(){
        this.arrayequipos.add(new Equipos(this.nombreEquipo, this.fechaCreacion, this.nombrePresidente, this.numeroCampeonatos));
        System.out.println("Equipos ingresado");
       
    }
   
    public void mostrar(){
        System.out.println("**** LISTADO DE EQUIPOS INGRESADOS ******");
        for (int i = 0; i < this.arrayequipos.size(); i++) {
            System.out.println(i+")  "+this.arrayequipos.get(i).nombreEquipo 
                    +" "+ this.arrayequipos.get(i).fechaCreacion
                    +" "+ this.arrayequipos.get(i).nombrePresidente
                    +" " + this.arrayequipos.get(i).numeroCampeonatos);
        }
    }
    
    public void eliminar(int indice){
        this.arrayequipos.remove(indice);
    }
    
}
