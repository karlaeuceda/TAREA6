
package clases;

public class Persona {
    
    String nombre;
    String apellido;
    
    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public String Mostrar(){
        return "EL NOMBRE ES: "+nombre+"\nEL APELLIDO ES: "+apellido;
    }
}
