package com.testAutomationCoach.aAbstraccion;

public class EjemploPelicula {
    public static void main(String[] args) {
        Pelicula b = new Pelicula();
        b.titulo = "Pesadilla en la calle del infierno";
        b.genero = "Terror";
        b.fechaEstreno = "12/12/1985";
        b.duracion = 1.30;

        b.nombreYEstreno(b.titulo, b.genero);
        b.reproducirPelicula(1.30);
    }

}