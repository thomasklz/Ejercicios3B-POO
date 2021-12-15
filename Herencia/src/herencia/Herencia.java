
package herencia;


public class Herencia {

   
    public static void main(String[] args) {
        
        Futbolista fut = new Futbolista();
        
        for (int i = 1; i <= 10; i++) {
               
                fut.setId(1);
                fut.setNombre("Tomas");
                fut.setApellido("Loor");
                fut.setEdad(22);
                fut.setDorsal(10);
                fut.setDemarcacion("Delantero");
                fut.guardar();
        }
    
       
       
        fut.mostrar();
        
        
    }
    
}
