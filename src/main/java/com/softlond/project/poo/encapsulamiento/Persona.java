package main.java.com.softlond.project.poo.encapsulamiento;

public class Persona {
    /**
     * public → accesible desde cualquier clase en cualquier paquete
     * protected → accesible dentro de la clase, en subclases,
     *  dentro del paquete aunque no se haga desde una subclase.
     * defautl → solo desde el mismo paquete
     * priavate → solo desde la misma clase
     */
    private String nombre;
    private String numeroCedula;
    private int edad;


    public Persona(String nombre, String numeroCedula, int edad) {
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

}
