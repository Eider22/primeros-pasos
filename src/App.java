import main.java.com.softlond.project.ArrayListDemo;
import main.java.com.softlond.project.ArraysDemo;
import main.java.com.softlond.project.Calculadora;
import main.java.com.softlond.project.ColasDemo;
import main.java.com.softlond.project.MathDemo;
import main.java.com.softlond.project.PilasDemo;
import main.java.com.softlond.project.StringDemo;
import main.java.com.softlond.project.poo.Animal;

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
        
        Animal animal2 = new Animal("Pinki",12, "Blanco", 15.2F);
        
        // animal2.correr();
        // System.out.println("Animal 2");
        // System.out.println(animal2.nombre);
        // System.out.println(animal2.edad);
        // System.out.println(animal2.peso);
        // System.out.println(animal2.color);
        Animal animal3 = new Animal("Pedro",12, "Blanco", 15.2F);
        
        Animal.imprimirContador();
    }

}
