package main.java.com.softlond.project.poo.polimorfismo;

// import main.java.com.softlond.project.poo.polimorfismo.contratos.IAnimal;

public class Perro extends Animal{
    public Perro(String nombre, String raza){
        super(nombre, raza);
    }


    @Override
    public void sonido(){
        System.out.println("Soy un perro y hago guauu guauuu");
    }


    @Override
    public void correr() {
       System.out.println("Soy un perro y corro por el suelo");
    }
}
