package com.testAutomationCoach.aAbstraccion;

public class CarritoDeCompras {
    public static void main(String[] args) {
        Articulo Compra = new Articulo();
        Compra.precio = 21.05;
        Compra.precioEspecial=21.05;
        Compra.descripcion="Mesa plegable";
        Compra.estrellas=2.0;
        Compra.procedencia="China";

        Compra.agregarCantidad(4);

    }






}
