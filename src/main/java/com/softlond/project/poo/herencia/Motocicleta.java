package main.java.com.softlond.project.poo.herencia;

public class Motocicleta extends MedioTerrestre {
    public String marcaCadena;

    public Motocicleta(float peso, float altura, String marcaCadena, Piloto piloto) {
        super(peso, altura, 2, piloto);
        this.marcaCadena = marcaCadena;
    }

}
