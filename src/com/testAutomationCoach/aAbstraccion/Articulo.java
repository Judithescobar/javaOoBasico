package com.testAutomationCoach.aAbstraccion;

public class Articulo {
    double precio;
    double precioEspecial;
    String descripcion;
    double estrellas;
    String procedencia;

public void agregarCarrito(int cantidad){
    agregarCantidad(cantidad);
    libs.Input.print(" Total " + precio*cantidad);
}

public void agregarCantidad(int cantidad){
    libs.Input.print("Se agregaron " + cantidad);
}
}

