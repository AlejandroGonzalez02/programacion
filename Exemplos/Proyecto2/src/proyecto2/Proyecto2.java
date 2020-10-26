/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author dam1a
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base= 4.5f; //se pon a f para que o tome como un datp float e non un double
        float altura= (float)2.5;//fago un cast nun foat xq x  defecto é un double
        float area;
        
        area=base*altura;
        
        System.out.println("La base del cuadrado es igual a " + area + ".");
    }
    
}
