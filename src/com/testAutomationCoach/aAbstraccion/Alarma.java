package com.testAutomationCoach.aAbstraccion;

public class Alarma {
    String horaActual;
    String horaAlarma;
    String tipoAlarma;
    String [] diasAlarma;


    public void pausarAlarma(){
        System.out.println("Alarma pausada");

    }
    public void programarAlarma (String hora, String[] dias){
        System.out.println("Alarma programada hora" + hora + " en los dias"+ dias );

    }

    public void setTipoAlarma(String tipoSonido){
        System.out.println("Alarma puesta con el sonido" + tipoSonido);
    }



    public void agregarDiaAlarma(String dia) {
        if(diasAlarma == null) {
            diasAlarma = new String[7];
        }
        int numeroCoincidencias = 0;
        for(String diaActual: diasAlarma) {
            if(diaActual != null &&
                    diaActual.equals(dia) ) {
                numeroCoincidencias++;
                break;
            }
        }
        if(numeroCoincidencias == 0 ) {
            //meter el dia.
        }
    }
}