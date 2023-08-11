package main.java.com.softlond.project.poo.excepciones.excepxionespersonalizadas;

public class Auto {
    private boolean disponible;

    public Auto(boolean disponible) {
        this.disponible = disponible;
    }

    public void alquilar() throws AutoNoDisponibleException {
        if (!disponible) {
            // lanzar un error personalizado
            throw new AutoNoDisponibleException("El auto no está disponible");
        }
        System.out.println("Auto alquilado exitosamente");
        disponible = false;
    }
}
