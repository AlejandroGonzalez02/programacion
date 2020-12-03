package com.dam1a.proyectoHelloMundo;

public class Taxi extends Vehiculo {
    private String numLicencia;

    public Taxi() {}

    public Taxi(String numLicencia, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numLicencia = numLicencia;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia() {
        this.numLicencia = numLicencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", numLicencia= " + numLicencia;
    }


}
