package main.java.com.softlond.project.poo.polimorfismo;

import main.java.com.softlond.project.poo.polimorfismo.contratos.IAnimal;

public class Gato extends Animal{

    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void sonido(){
        System.out.println("Soy gato y hago miauu miauu");
    }

    @Override
    public void correr() {
        System.out.println("El gato esta corriendo");
    }
    
}
