package com.softtek.modelo.ejercicio6;

public class ClienteDao {
    private IDAO conexion;

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente) {
        return conexion.insertar(cliente);
    }
}
