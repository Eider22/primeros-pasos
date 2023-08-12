package main.java.com.softlond.project.poo.polimorfismo;

import main.java.com.softlond.project.poo.polimorfismo.contratos.IAereo;

public class Avion implements IAereo{

    @Override
    public void volar() {
        System.out.println("Soy un avión y vuelo gracias a mi sestructura tecnológica");
    }
    
}
