package main.java.com.softlond.project.poo.clasesabstractas;

abstract public class Forma extends Objeto{
    
    private String nombre;

    public Forma(String nombre){
        super(2);
        this.nombre = nombre;
    }

    public abstract double calcularArea();  //sin cuerpo

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Área: " + this.calcularArea());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
