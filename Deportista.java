
package clases;


public class Deportista extends Persona {
    
    String entrenar;
    
    public Deportista(String nombre, String apellido, String entrenar) {
        super(nombre, apellido);
        this.entrenar=entrenar;
    }
    
    @Override
    public String Mostrar(){
        return super.Mostrar()+"\n CUANTO TIEMPO ENTRENA ES: "+entrenar;
    }
    
}
