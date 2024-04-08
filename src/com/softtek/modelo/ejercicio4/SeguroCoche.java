package com.softtek.modelo.ejercicio4;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche c) {
        return taller.reparar(c);
    }
}