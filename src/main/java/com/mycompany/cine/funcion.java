/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author wissegt
 */
public class funcion extends Pelicula{
    
    private int noSala;
    private int cantidad;
    private int precio;

    public funcion(int Sala, int cantidad, int precio, String nombre, String fechatr, String duracion) {
        super(nombre, fechatr, duracion);
        this.noSala = Sala;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getNoSala() {
        return noSala;
    }

    public void setNoSala(int noSala) {
        this.noSala = noSala;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "funcion{" +"Nombre peli"+getNombre()+ "Sala No. =" + noSala + ", Cantidad de personas=" + cantidad + ", Precio=" + precio + '}';
        
    }
    
    
    
}
