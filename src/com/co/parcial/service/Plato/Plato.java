package com.co.parcial.service.Plato;

public class Plato {
    private String nombre;
    private String categoria;
    private double precio;

    public Plato(String nombre, String categoria, double precio){
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato [" + "nombre='" + this.nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio= $" + precio +
                ']';
    }
}
