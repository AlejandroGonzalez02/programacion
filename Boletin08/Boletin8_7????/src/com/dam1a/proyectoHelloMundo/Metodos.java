package com.dam1a.proyectoHelloMundo;
import javax.swing.JOptionPane;
public class Metodos {
    //Triangulo
    public void calcularTriangulo() {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce a base: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce a altura: "));
        System.out.println("Area= "+(base*altura/2));
    }
    //Cadrado
    public void calcularCadrado(){
        float lado=Float.parseFloat(JOptionPane.showInputDialog("Introduce o lado do cadrado: "));
        System.out.println("Área: "+Math.pow(lado,2));
    }
    //Rectangulo
    public void calcularRectangulo(){
        float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce o base do rectángulo: "));
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce o altura do cadrado: "));
        System.out.println("Area"+(altura*base));
    }
}
