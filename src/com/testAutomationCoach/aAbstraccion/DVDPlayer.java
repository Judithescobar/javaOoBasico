package com.testAutomationCoach.aAbstraccion;

class DVDPlayer {


    boolean canRecord = false;


    void recordDVD() {
        System.out.println("DVD recording");
    }

    public void playDVD() {System.out.println("DVD playing");
    }
}


class DVDPlayerTestDrive {
    public static void main(String [] args) {

//        Por que no compila el codigo de abajo?
        //Respuesta: Por que no estaba creado el m[etodo recordDVD.
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();


        if (d.canRecord == true) {
            d.recordDVD();

        }
    }
}