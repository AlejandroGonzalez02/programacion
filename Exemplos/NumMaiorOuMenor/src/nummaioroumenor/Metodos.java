
package nummaioroumenor;

import javax.swing.JOptionPane;


public class Metodos {
    
    public int pedirInt(){
    String resposta = JOptionPane.showInputDialog("Teclea a idade: ");
    int valor= Integer.parseInt(resposta);
    return valor;
    } 
    public int pedirInt2(){
    int valor= Integer.parseInt(JOptionPane.showInputDialog("teclea idade:"));
    return valor;
    }
    
}
