
package herencia;


public class EquipoFutbol {
   private String nombre, apellido;
   private int id, edad;

    public EquipoFutbol(String nombre, String apellido, int id, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
    }

    public EquipoFutbol() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void concentrarse(){
        System.out.println("Concentrado");
    }
    public void viajar(){
        System.out.println("Viajando");
    }
}
