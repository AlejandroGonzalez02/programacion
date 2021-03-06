package com.dam1a.proyectoHelloMundo;

public class Vehiculo {

    private String matricula;
    private String modelo;
    int potencia;

    public Vehiculo(){
    }
    public Vehiculo(String matricula, String modelo, int potencia) {
    this.matricula=matricula;
    this.modelo=modelo;
    this.potencia=potencia;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    @Override
    public String toString() {
        return "Matricula="+matricula+", Modelo="+modelo +", Potencia="+potencia;
    }
}
