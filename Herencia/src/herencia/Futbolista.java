
package herencia;

import java.util.ArrayList;


public class Futbolista extends EquipoFutbol{
    
    private String  demarcacion;
    private int  dorsal;
    
    ArrayList<Futbolista> arrayFutbolista = new ArrayList<>();
    
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(nombre, apellido, id, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    public Futbolista() {
        
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

  
    public void guardar(){
        this.arrayFutbolista.add(new Futbolista(getId(), getNombre(),getApellido(),getEdad(), getDorsal(),getDemarcacion()));
    }
    
    public void mostrar(){
        for (int i = 0; i < arrayFutbolista.size(); i++) {
            System.out.print("Registro: "+i);
            System.out.println(getId()+" "+ getNombre()+" "+getApellido()+" "+getEdad()+" "+ getDorsal()+" "+getDemarcacion());
        }
    }
    public void jugarpartido(){}                
    public void entrenar(){}
}
