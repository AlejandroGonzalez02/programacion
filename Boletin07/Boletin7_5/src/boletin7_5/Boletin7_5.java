package boletin7_5;
import javax.swing.JOptionPane;
public class Boletin7_5 {
    public static void main(String[] args) {
    
        Clase obx=new Clase();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número: "));
        obx.mayor(n1,n2,n3);
    }
    
}
