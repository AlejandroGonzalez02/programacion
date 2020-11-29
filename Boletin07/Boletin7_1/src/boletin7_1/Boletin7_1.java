
package boletin7_1;

import javax.swing.JOptionPane;

public class Boletin7_1 {

    
    public static void main(String[] args) {
        PositivoNegativo obx1 = new PositivoNegativo();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número: "));
        obx1.n(numero);
        
    }
    
}
