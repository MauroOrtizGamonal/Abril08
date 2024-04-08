package com.softtek.modelo.ejercicio5;

public class Secretario implements Empleado {
    private Informe informe;
    private String empresa;
    private String email;

    public Secretario(Informe informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        // Lógica para obtener las tareas del secretario
        return "Gestionar agenda y comunicaciones";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
