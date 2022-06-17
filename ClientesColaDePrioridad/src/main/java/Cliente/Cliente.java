package Cliente;

public class Cliente implements Comparable<Cliente>{
    
    private String nombre;
    private boolean discapacidad;
    private boolean embarazo;
    private int edad;
    
    public Cliente(String nombre, boolean discapacidad, boolean embarazo, int edad){
        this.nombre = nombre;
        this.discapacidad = discapacidad;
        this.embarazo = embarazo;
        this.edad = edad;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public boolean isEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(boolean embarazo) {
        this.embarazo = embarazo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return ("Cliente{" + this.nombre + ": Discapacidad -> " + this.discapacidad 
                    + ", Embarazo -> "+ this.embarazo
                    + ", Edad -> "+ this.edad + ".}");
    }
    
    @Override
    public int compareTo(Cliente o) {
        return 1;
    }
    
}
