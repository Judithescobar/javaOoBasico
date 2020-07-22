package com.testAutomationCoach.aAbstraccion;

class TapeDeck {


    boolean canRecord = false;


    void playTape() {
        System.out.println("tape playing");
    }


    void recordTape() {
        System.out.println("tape recording");
    }
}


class TapeDeckTestDrive {
    public static void main(String [] args) {
        TapeDeck  t = new TapeDeck();
//Por que no compilan las instrucciones de abajo?
        // Respuesta: Por que no se creo la instancia
        t.canRecord = true;
        t.playTape();


        if (t.canRecord == true) {
            t.recordTape();

        }
    }
}
