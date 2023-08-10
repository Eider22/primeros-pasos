import java.util.ArrayList;
import java.util.List;

import main.java.com.softlond.project.ArrayListDemo;
import main.java.com.softlond.project.ArraysDemo;
import main.java.com.softlond.project.Calculadora;
import main.java.com.softlond.project.ColasDemo;
import main.java.com.softlond.project.MathDemo;
import main.java.com.softlond.project.PilasDemo;
import main.java.com.softlond.project.StringDemo;
// import main.java.com.softlond.project.poo.Animal;
import main.java.com.softlond.project.poo.clasesabstractas.Circulo;
import main.java.com.softlond.project.poo.clasesabstractas.Forma;
import main.java.com.softlond.project.poo.clasesabstractas.Rectangulo;
import main.java.com.softlond.project.poo.encapsulamiento.Contaduria;
import main.java.com.softlond.project.poo.encapsulamiento.Estudiante;
import main.java.com.softlond.project.poo.encapsulamiento.ModuloInscripcion;
import main.java.com.softlond.project.poo.encapsulamiento.Persona;
import main.java.com.softlond.project.poo.encapsulamiento2.Foraneo;
import main.java.com.softlond.project.poo.herencia.MedioTerrestre;
import main.java.com.softlond.project.poo.herencia.MedioTransporte;
import main.java.com.softlond.project.poo.herencia.Motocicleta;
import main.java.com.softlond.project.poo.herencia.Piloto;
// import main.java.com.softlond.project.poo.interfaces.implementaciones.animales.Animal;
import main.java.com.softlond.project.poo.interfaces.implementaciones.transportes.Automovil;
import main.java.com.softlond.project.poo.polimorfismo.Animal;
import main.java.com.softlond.project.poo.polimorfismo.Avion;
import main.java.com.softlond.project.poo.polimorfismo.Gallina;
import main.java.com.softlond.project.poo.polimorfismo.Gato;
import main.java.com.softlond.project.poo.polimorfismo.Perro;
import main.java.com.softlond.project.poo.polimorfismo.contratos.IAereo;
import main.java.com.softlond.project.poo.polimorfismo.contratos.IAnimal;

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

        // ------POO-instanciación de objetos-------
        // Animal animal1 = new Animal("Firulais", 5, "Negro", 12.5F);

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

        // ------POO-Herencia--------
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

        // Piloto piloto1 = new Piloto("Juan", 32);

        // System.out.println(piloto1.nombre);

        // MedioTransporte mt1 = new MedioTransporte(100, 2, piloto1);
        // MedioTransporte mt2 = new MedioTransporte(200, 4);

        // ------Sobrecarga de motodos--------
        // mt1.encender();
        // mt1.encender("1232");

        // System.out.println(mt1.piloto.nombre);
        // System.out.println(mt1.piloto.edad);

        // Motocicleta moto1 = new Motocicleta(150, 0.75F, "AXS", piloto1);
        // System.out.println(moto1.piloto.nombre);

        // -----Encapsulamiento/ encapsulación---------
        // public
        // protected
        // private
        // default

        // Persona persona1 = new Persona("Eider", "10000000", 27);
        // System.out.println(persona1.nombre);
        // System.out.println(persona1.numeroCedula);
        // System.out.println(persona1.edad);

        // Estudiante estudiante1 = new Estudiante("Juan", "2000000",25);
        // Estudiante estudiante2 = new Estudiante("Pedro", "3000000",22);
        // Estudiante estudiante3 = new Estudiante("José", "4000000",21);

        // System.out.println(estudiante1.getNombre());
        // estudiante1.setNombre("Alfredo");
        // System.out.println(estudiante1.getNombre());
        // System.out.println(estudiante1.getNumeroCedula());
        // System.out.println(estudiante1.numeroCedula);
        // System.out.println(estudiante1.edad);
        /* Aca podemos ver que no se puede acceder a un protected fuera del paquete */
        // System.out.println(estudiante1.id);

        // ModuloInscripcion sistemaInscripcion = new ModuloInscripcion();
        // sistemaInscripcion.incribirEstudiante(estudiante1);
        // sistemaInscripcion.incribirEstudiante(estudiante2);
        // sistemaInscripcion.incribirEstudiante(estudiante3);

        // Foraneo wilson = new Foraneo("Ander", "546154", 20);
        // Foraneo eider = new Foraneo("Pepe", "654654", 22);

        // wilson.testAccesoProtected();
        // eider.testAccesoProtected();

        // System.out.println(estudiante1.toString());
        // estudiante1.setPromedio(4.5f);

        // Contaduria contaduria = new Contaduria();

        // float costoMatricula = contaduria.obtenerCostoMatricula(1000000, estudiante1,
        // 2);
        // System.out.println(costoMatricula);

        // System.out.println(estudiante1.toString());

        // ----------Clases abstractas
        // Circulo circulo1 = new Circulo(10);
        // Rectangulo rect1 = new Rectangulo(10, 20);

        // System.out.println(circulo1.calcularArea());
        // System.out.println(rect1.calcularArea());
        // circulo1.mostrarInfo();
        // rect1.mostrarInfo();

        // System.out.println( rect1.getDimensiones());

        // Automovil auto1 = new Automovil();
        // auto1.desplazarse(50);

        // Animal animal1 = new Animal();
        // animal1.desplazarse(10);
        // animal1.emitirSonido();;

        // System.out.println(auto1.direccionarDesplazamiento("Derecha"));

        //---Polimorfismo
        //---polimorfismo de subtipos → herencia
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal perro1 = new Perro("Pinki", "French poodle");
        Animal gato1 = new Gato("Michi", "Persa");

        animales.add(perro1);
        animales.add(gato1);

        for (Animal animal : animales) {
            animal.sonido();
        }

        //Polimorfismo con interfaces
        List<IAnimal> animales2 = new ArrayList<>();
        // ArrayList<Perro> perros = new ArrayList<>();
        // ArrayList<Gato> gatos = new ArrayList<>();

        IAnimal perro2 = new Perro("Pinki2", "French poodle 2");
        IAnimal gato2 = new Gato("Michi2", "Persa 2");
        IAnimal gallina1 = new Gallina("Josefina","Criolla");

        // Perro perro2 = new Perro("Pinki2", "French poodle 2");
        // Gato gato3 = new Gato("Michi2", "Persa 2");

        animales2.add(perro2);
        animales2.add(gato2);
        animales2.add(gallina1);
        // perros.add(perro2);
        // gatos.add(gato3);

        for (IAnimal animal : animales2) {
            animal.correr();            
        }


        List<IAereo> cosasQuePuedenVolar = new ArrayList<>();

        IAereo gallina2 = new Gallina("Tomasa", "Ponedora");
        IAereo avion1 = new Avion();

        cosasQuePuedenVolar.add(gallina2);
        cosasQuePuedenVolar.add(avion1);

        // gallina2.volar();
        // avion1.volar();

        for (IAereo aereo : cosasQuePuedenVolar) {
            aereo.volar();
        }

        // for (Perro perro : perros) {
        //     perro.correr();
        // }
        // for (Gato gato : gatos) {
        //     gato.correr();
        // }

        




    }
}
