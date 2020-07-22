package com.testAutomationCoach.aAbstraccion;

public class EjemploAlarma {
    public static void main(String[] args) {
        Alarma ejemploAlarma        =new Alarma();
        //ejemploAlarma.diasAlarma = new String[7];
        ejemploAlarma.horaActual    ="07:00";
        ejemploAlarma.horaAlarma    ="07:40";
        ejemploAlarma.tipoAlarma    ="La bamba";
        ejemploAlarma.agregarDiaAlarma("Lunes");
        ejemploAlarma.agregarDiaAlarma("Miercoles");

        ejemploAlarma.pausarAlarma();
        ejemploAlarma.programarAlarma (ejemploAlarma.horaAlarma, ejemploAlarma.diasAlarma);
        ejemploAlarma.setTipoAlarma(ejemploAlarma.tipoAlarma);
    }

}
