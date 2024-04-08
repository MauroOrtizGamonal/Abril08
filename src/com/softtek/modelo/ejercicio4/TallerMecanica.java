package com.softtek.modelo.ejercicio4;

public class TallerMecanica implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "Reparando coche en taller de mecánica";
    }
}