/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cine;
import java.util.Scanner;

/**
 *
 * @author wissegt
 */
public class Cine {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Metodo metodo = new Metodo();
        
       System.out.println("Nombre de la pelicula");
       String nombre = src.nextLine();
       System.out.println("Fecha estreno");
       String fechatr = src.nextLine();
       System.out.println("Dureacion pelicula" );
       String duracion = src.nextLine();
       
       Pelicula pelicula = new Pelicula(nombre, fechatr, duracion);
       metodo.agregarPelicula(pelicula);

        
    }
}
