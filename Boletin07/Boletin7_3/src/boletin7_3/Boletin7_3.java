package boletin7_3;

import javax.swing.JOptionPane;

public class Boletin7_3 {

    public static void main(String[] args) {
        Calculos obx1= new Calculos();
        int number=Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero: "));
        obx1.positivo(number);

    }
    
}
