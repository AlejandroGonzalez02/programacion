package com.dam1a.proyectoHelloMundo;

public class Main {

    public static void main(String[] args) {
        Taxi obxTaxi= new Taxi("125a232s","4545SDF","Audi",56);
        Autobus obxAutobus= new Autobus();
        obxAutobus.setNumPlazas(56);
        obxAutobus.setModelo("LandRober");
        obxAutobus.setMatricula("3682ERT");
        obxAutobus.setPotencia(322);


        System.out.println("Taxi: "+obxTaxi.toString());
        System.out.println("Autobus: "+obxAutobus.toString());
    }
}
