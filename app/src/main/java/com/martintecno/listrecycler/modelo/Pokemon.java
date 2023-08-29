package com.martintecno.listrecycler.modelo;

public class Pokemon {

    private String nombre;
    private String imagenURL;
    private String descripcion;

    public Pokemon(String nombre, String imagenURL, String descripcion) {
        this.nombre = nombre;
        this.imagenURL = imagenURL;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
