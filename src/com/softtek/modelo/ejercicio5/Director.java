package com.softtek.modelo.ejercicio5;

public class Director implements Empleado {
    private Informe informe;

    public Director(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        // Lógica para obtener las tareas del director
        return "Gestionar la empresa";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
