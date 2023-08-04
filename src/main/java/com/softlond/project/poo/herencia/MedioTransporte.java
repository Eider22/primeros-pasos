package main.java.com.softlond.project.poo.herencia;

public class MedioTransporte {
    public float peso;
    public float altura;
    public Piloto piloto;
    
    public MedioTransporte(float peso, float altura, Piloto piloto) {
        this.peso = peso;
        this.altura = altura;
        this.piloto = piloto;
    }

    public void encender(String clave){
        System.out.println("El medio de transporte arrancó con clave");
    }

    public void encender(){
        System.out.println("El medio de transporte arrancó");
    }
    
    public void apagar(){
        System.out.println("El medio de transporte se apagó");
    }
    
}
