package main.java.com.softlond.project.poo.polimorfismo;

import main.java.com.softlond.project.poo.polimorfismo.contratos.IAnimal;

public class Animal implements IAnimal{
    private String nombre;
    private String raza;

    public Animal(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }

    public void sonido(){
        System.out.println("Soy animal y hago sonidos");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void correr() {
        System.out.println("Soy un animal y corro");
    }

    
    
}
