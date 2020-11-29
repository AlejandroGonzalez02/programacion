package boletin7_4;
import javax.swing.JOptionPane;
public class Boletin7_4 {

    
    public static void main(String[] args) {
        Clase obx = new Clase();
        String nome1 = JOptionPane.showInputDialog("teclea o nome1: ");
        int peso1 = Integer.parseInt(JOptionPane.showInputDialog("teclea o peso1: "));
        String nome2 = JOptionPane.showInputDialog("teclea o nombre2: ");
        int peso2 = Integer.parseInt(JOptionPane.showInputDialog("teclea o peso2: "));
        obx.peso(nome1, peso1, nome2, peso2);
    }
    
}
