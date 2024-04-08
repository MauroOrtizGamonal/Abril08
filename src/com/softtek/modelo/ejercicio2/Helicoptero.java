package com.softtek.modelo.ejercicio2;

public class Helicoptero implements ObjetoVolador {
    @Override
    public void despegar() {
        System.out.println("El helicóptero está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El helicóptero está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El helicóptero está volando.");
    }
}
