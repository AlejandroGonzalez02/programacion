package com.dam1a.proyectoHelloMundo;

public class Autobus extends Vehiculo{

    private int numPlazas;

    public Autobus(){}
    public Autobus(int numPlazas, String matricula, String modelo, int potencia) {
        super(matricula, modelo,potencia);
        this.numPlazas = numPlazas;
    }
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    @Override
    public String toString() {
        return super.toString() + ", numPlazas= " + numPlazas;
    }
}
