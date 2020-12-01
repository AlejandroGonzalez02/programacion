package com.dam1a.proyectoHelloMundo;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        Metodos obx1 = new Metodos();
        String resposta;
        do {
            resposta = JOptionPane.showInputDialog("MENÚ \n1. Área Triángulo \n2. Área Cadrado \n3. Área Rectánulo \n Se queres sair teclea FIN \nTeclea a resposta: ");
            switch (resposta) {
                case "Área Triángulo":
                    obx1.calcularTriangulo();
                    break;
                case "Área Cadrado":
                    obx1.calcularCadrado();
                    break;
                case "Área Círulo":
                    obx1.calcularRectangulo();
                default:
                    System.out.println("Operación incorrecta");
            }

        }while (resposta!="FIN");

    }
}