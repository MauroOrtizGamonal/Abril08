package com.softtek.modelo.ejercicio3;

// Clase Coche que implementa la interfaz Vehiculo
public class Coche implements Vehiculo {
    private int deposito;

    // Constructor
    public Coche(int deposito) {
        this.deposito = deposito;
    }

    // Método para moverse, solo si hay gasolina en el depósito
    @Override
    public void moverse() {
        if (deposito > 0) {
            System.out.println("El coche se mueve.");
        } else {
            System.out.println("El coche no puede moverse, no hay gasolina en el depósito.");
        }
    }
}
