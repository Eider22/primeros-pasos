package main.java.com.softlond.project.poo;

public class Animal {
    public static int contador = 0;
    public String nombre;
    public int edad;
    public String color;
    public float peso;

    public Animal(String nombre, int edad, String color, float peso) {       
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        contador ++;
    }

    public void correr() {
        System.out.println(this.nombre + " está corriendo...");
    }

    public static void imprimirContador(){
        System.out.println(contador);
    }

}
