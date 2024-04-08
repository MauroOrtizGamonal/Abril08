package com.softtek.modelo.ejercicio4;

public class TallerPintura implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "Reparando coche en taller de pintura";
    }
}