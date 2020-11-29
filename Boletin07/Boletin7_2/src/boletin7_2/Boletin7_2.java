package boletin7_2;

import javax.swing.JOptionPane;

public class Boletin7_2 {

    public static void main(String[] args) {
        Calculos obx = new Calculos();
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        obx.Cal(numero1,numero2);
    }
    
}
