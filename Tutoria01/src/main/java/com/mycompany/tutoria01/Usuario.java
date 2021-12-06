
package com.mycompany.tutoria01;

import java.util.ArrayList;


public class Usuario {
   String usuario, password;
   ArrayList<Usuario> arrayUsuario = new ArrayList<>();
   
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario() {
        
    }
    
   
     public void ingresar(String user, String pass){
         this.arrayUsuario.add(new Usuario (user, pass));
     }
     
     
      public void mostrar(){
         for (int i = 0; i < this.arrayUsuario.size(); i++) {
             System.out.println(this.arrayUsuario.get(i).usuario + " "+ this.arrayUsuario.get(i).password);
         }
     }
     
     public void modificar(String user, String newuser, String newpass){
         for (int i = 0; i < this.arrayUsuario.size(); i++) {
             if(user.equals(this.arrayUsuario.get(i).usuario)){
                 this.arrayUsuario.set(i,new Usuario (newuser, newpass));
                 System.out.println("El usuario de modificó correctamente");
             }
         }
     }
     
      public void buscar(String user){
          for (int i = 0; i < this.arrayUsuario.size(); i++) {
              if(user.equals(this.arrayUsuario.get(i).usuario)){
                  System.out.println("Usuario encontrado");
              }
          }
      }
   
}
