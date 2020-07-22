package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {
    public static void main(String[] args) {
    Articulo producto = new Articulo();
    producto.descripcion="Herramienta corte de botella";
    producto.estrellas = 2.5;
    producto.precio=1440.33;
    producto.precioEspecial = 1440.33;
    producto.procedencia = "China";


    //producto.agregarCantidad(4);
    producto.agregarCarrito(4);

    }
}
