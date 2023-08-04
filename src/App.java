import main.java.com.softlond.project.ArrayListDemo;
import main.java.com.softlond.project.ArraysDemo;
import main.java.com.softlond.project.Calculadora;
import main.java.com.softlond.project.ColasDemo;
import main.java.com.softlond.project.MathDemo;
import main.java.com.softlond.project.PilasDemo;
import main.java.com.softlond.project.StringDemo;
import main.java.com.softlond.project.poo.Animal;
import main.java.com.softlond.project.poo.herencia.MedioTerrestre;
import main.java.com.softlond.project.poo.herencia.MedioTransporte;
import main.java.com.softlond.project.poo.herencia.Motocicleta;
import main.java.com.softlond.project.poo.herencia.Piloto;

public class App {
    // variables
    // constructor
    // otros métodos
    public static void main(String[] args) throws Exception {
        // Calculadora.suma(2, 5);
        // Calculadora.suma(5, 3);
        // System.out.println(Calculadora.resta(10, 5));
        // MathDemo.run();
        // StringDemo.run();
        // ArraysDemo.run();
        // ArraysDemo.maximo();
        // ArrayListDemo.run();
        // PilasDemo.run();
        // ColasDemo.run();

        Animal animal1 = new Animal("Firulais", 5, "Negro", 12.5F);

        // System.out.println("Animal 1");
        // System.out.println(animal1.nombre);
        // System.out.println(animal1.edad);
        // System.out.println(animal1.peso);
        // System.out.println(animal1.color);

        // animal1.correr();

        // Animal animal2 = new Animal("Pinki",12, "Blanco", 15.2F);

        // animal2.correr();
        // System.out.println("Animal 2");
        // System.out.println(animal2.nombre);
        // System.out.println(animal2.edad);
        // System.out.println(animal2.peso);
        // System.out.println(animal2.color);
        // Animal animal3 = new Animal("Pedro",12, "Blanco", 15.2F);

        // Animal.imprimirContador();

        // MedioTerrestre medioT = new MedioTerrestre(1250, 2, 4);
        // MedioTerrestre medioT2 = new MedioTerrestre(1280, 3, 2);

        // System.out.println("----Medio transporte 1---------");
        // System.out.println(medioT.altura);
        // System.out.println(medioT.peso);
        // System.out.println(medioT.cantidadLlantas);

        // System.out.println("----Medio transporte 2---------");
        // System.out.println(medioT2.altura);
        // System.out.println(medioT2.peso);
        // System.out.println(medioT2.cantidadLlantas);

        // medioT.encender();
        // medioT.apagar();

        // System.out.println("----Motocicleta 1---------");
        // Motocicleta moto1 = new Motocicleta(150, 0.75F, "AXS");
        
        // System.out.println(moto1.altura);
        // System.out.println(moto1.cantidadLlantas);
        // System.out.println(moto1.peso);
        // System.out.println(moto1.marcaCadena);
        
        Piloto piloto1 = new Piloto("Juan", 32);
        
        // System.out.println(piloto1.nombre);
        
        MedioTransporte mt1 = new MedioTransporte(100, 2, piloto1);
        // MedioTransporte mt2 = new MedioTransporte(200, 4);
        
        // mt1.encender();
        // mt1.encender("1232");
        
        // System.out.println(mt1.piloto.nombre);
        // System.out.println(mt1.piloto.edad);
        
        Motocicleta moto1 = new Motocicleta(150, 0.75F, "AXS", piloto1);
        System.out.println(moto1.piloto.nombre);
        
    }

}
