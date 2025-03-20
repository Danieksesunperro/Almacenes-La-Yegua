/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.yegua.entidades;

import mx.itson.yegua.enums.Categoria;

/**
 *
 * @author alumnog
 */
public class Articulo {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the categoría
     */
    public Categoria getCategoría() {
        return categoría;
    }

    /**
     * @param categoría the categoría to set
     */
    public void setCategoría(Categoria categoría) {
        this.categoría = categoría;
    }
    
    private String nombre;
    private double precio;
    private Categoria categoría;
}