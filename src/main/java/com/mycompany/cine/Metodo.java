/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

import java.util.ArrayList;

/**
 *
 * @author wissegt
 */
public class Metodo {
    ArrayList<Pelicula> peli= new ArrayList<>();
    ArrayList<funcion> func = new ArrayList<>();

    //metodo agregar estuidante
    public void agregarPelicula(Pelicula pelicula) {
        peli.add(pelicula);
    }
    
    // metodo agregar funcion
    
    public void agregarFuncion(funcion Funcion){
        func.add(Funcion);
    }
    
    
}
