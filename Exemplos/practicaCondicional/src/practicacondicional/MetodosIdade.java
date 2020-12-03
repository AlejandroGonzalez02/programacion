package practicacondicional;

import javax.swing.JOptionPane;

public class MetodosIdade {    
    public int pedirInt(){
    String idade = JOptionPane.showInputDialog("Teclee a idade: ");
    int valor= Integer.parseInt(idade);
    return valor;
    } 
}
