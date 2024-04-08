package com.softtek.modelo.ejercicio3;

// Clase Conductor
public class Conductor {
    private Vehiculo vehiculo;

    // Constructor
    public Conductor(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Método para conducir el vehículo asignado al conductor
    public void conducir() {
        vehiculo.moverse();
    }
}
