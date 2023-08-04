package main.java.com.softlond.project.poo.herencia;

public class MedioTerrestre extends MedioTransporte{

    public int cantidadLlantas;  

    public MedioTerrestre(float peso, float altura, int cantidadLlantas, Piloto piloto) {
        super(peso, altura, piloto);
        this.cantidadLlantas = cantidadLlantas;
    }

    @Override
    public void encender(){
        System.out.println("El medio de transporte terrestre arrancó");
    }

    @Override
    public void apagar(){
        System.out.println("El medio de transporte terrestre se apagó");
    }

    public void rodar(){
        System.out.println("El medio de transporte terrestre está rodando");
    }


   
}
