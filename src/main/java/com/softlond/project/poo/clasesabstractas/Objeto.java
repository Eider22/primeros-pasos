package main.java.com.softlond.project.poo.clasesabstractas;

abstract public class Objeto {
    private int dimensiones;

    public Objeto(int dimensiones){
        this.dimensiones = dimensiones;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }
    
}
