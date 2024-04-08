package com.softtek.modelo.ejercicio2;

public class Barcaza implements Nautico {
    @Override
    public void atracar() {
        System.out.println("La barcaza está atracando.");
    }

    @Override
    public void navegar() {
        System.out.println("La barcaza está navegando.");
    }
}
