package com.testAutomationCoach.aAbstraccion;

public class Pelicula {

    String titulo;
    String genero;
    String fechaEstreno;
    double duracion;

     public void nombreYEstreno(String titulo, String genero){
         System.out.println("Que genero es la pelicula? Comica/Ficcion/Terror ");

         System.out.println("Titulo "+titulo);
         System.out.println("Genero "+genero);

        if (genero=="Terror") {
            System.out.println("No la veas de noche");
        }
     }
    public void reproducirPelicula(double duracion){
        System.out.println("Duracion de la pelicula " + duracion);
    }
}
