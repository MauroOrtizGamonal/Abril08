package com.softtek.modelo.ejercicio7;

import java.util.Random;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    // Constructor con ID
    public Producto(int id, String nombre, double precio, String proveedor, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    // Constructor sin ID (usando generación automática)
    public Producto(String nombre, double precio, String proveedor, String descripcion) {
        this.id = generarID();
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    // Método para generar un ID único
    private static int contadorID = 1;

    private int generarID() {
        return contadorID++;
    }

    // Método para comprobar el producto
    public void comprobar() throws ProductoException {
        if (id == 0) {
            throw new ProductoException("Error: El producto no tiene asignado un ID");
        }
        // Aquí puedes agregar más lógica de comprobación si es necesario
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
