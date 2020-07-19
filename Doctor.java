
package clases;

public class Doctor extends Persona {
    
    String especialidad;
    
    public Doctor(String nombre, String apellido, String especialidad) {
        super(nombre, apellido);
        this.especialidad=especialidad;
    }
    
    @Override
    public String Mostrar(){
        return super.Mostrar()+"\nLA ESPECIALIDAD ES: "+especialidad;
    }
}
