package com.softtek.modelo.ejercicio1;

public class Gusano extends Animal {
    @Override
    public void comer() {
        System.out.println("El gusano está comiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El gusano se arrastra.");
    }
}
