package main.java.com.softlond.project.poo.interfaces.implementaciones.transportes;

import main.java.com.softlond.project.poo.interfaces.contratos.Desplazable;

public class Automovil implements Desplazable {

    @Override
    public void desplazarse(float metros) {
        System.out.println("Soy un automóvil y me estoy desplazando " + metros + " metros");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un automóvil y estoy frenando");
    }

    @Override
    public String direccionarDesplazamiento(String direccion) {
       return "Soy un auto y me estoy desplazando hacia la dirección " + direccion;
    }
    

}
