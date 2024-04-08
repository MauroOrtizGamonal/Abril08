package com.softtek.modelo.ejercicio2;

public class Hidroavion implements Nautico, ObjetoVolador {
    @Override
    public void atracar() {
        System.out.println("El hidroavión está atracando.");
    }

    @Override
    public void navegar() {
        System.out.println("El hidroavión está navegando.");
    }

    @Override
    public void despegar() {
        System.out.println("El hidroavión está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El hidroavión está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El hidroavión está volando.");
    }
}
