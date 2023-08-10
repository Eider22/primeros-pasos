package main.java.com.softlond.project.poo.polimorfismo;

import main.java.com.softlond.project.poo.polimorfismo.contratos.IAereo;

public class Gallina extends Animal implements IAereo{

    public Gallina(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void correr() {
       System.out.println("Soy una gallina y estoy corriendo");
    }

    @Override
    public void volar() {
       System.out.println("Soy una gallina y vuelo");
    }
    
}
