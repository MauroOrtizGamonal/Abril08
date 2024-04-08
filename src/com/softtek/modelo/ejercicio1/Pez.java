package com.softtek.modelo.ejercicio1;

public class Pez extends Animal {
    @Override
    public void comer() {
        System.out.println("El pez está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El pez está nadando.");
    }
}
