package main.java.com.softlond.project.poo.interfaces.implementaciones.animales;

import main.java.com.softlond.project.poo.interfaces.contratos.Desplazable;
import main.java.com.softlond.project.poo.interfaces.contratos.EmisorSonido;

public class Animal implements Desplazable, EmisorSonido {

    @Override
    public void desplazarse(float metros) {
        System.out.println("Soy un animal estoy desplazando " + metros + " metros");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Soy un animal y emito sonidos");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un animal y etsoy frenando");
    }

    @Override
    public String direccionarDesplazamiento(String direccion) {
       return "Soy un animal y me estoy desplazando hacia la dirección " + direccion;
    }

}
