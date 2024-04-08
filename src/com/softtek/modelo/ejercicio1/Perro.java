package com.softtek.modelo.ejercicio1;

public class Perro extends Animal {
    @Override
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El perro está moviéndose.");
    }
}
