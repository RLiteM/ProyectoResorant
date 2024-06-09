/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author wissegt
 */
public class Pelicula {
    private String nombre;
    private String fechatr;
    private String duracion;

    public Pelicula(String nombre, String fechatr, String duracion) {
        this.nombre = nombre;
        this.fechatr = fechatr;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechatr() {
        return fechatr;
    }

    public void setFechatr(String fechatr) {
        this.fechatr = fechatr;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", fecha estreno=" + fechatr + ", duracion=" + duracion + '}';
    }
    
    
    
}
