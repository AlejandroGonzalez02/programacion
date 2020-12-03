
package practicacondicional;

import javax.swing.JOptionPane;

public class PracticaCondicional {

    public static void main(String[] args) {
        /*Coñecido o nome e idade dunha persoa indica, se e neno, adolescente, xoven, ou adulto.
        Segun a seguinte relación:
        <14=neno
        15-18=adolescente
        19-30=xoven
        >30=adulto
        */ 
        //Valoridade obx= new Valoridade();
        //return Int.ParseInt(JOptionPane.showInputDialog("Teclea a tua idade: "));
        
        //DIA DA SEMANA
        CondicionalMultiple obx=new CondicionalMultiple();
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero do día: "));
        obx.amosarDia(numero);
        

        
    }
    
}
