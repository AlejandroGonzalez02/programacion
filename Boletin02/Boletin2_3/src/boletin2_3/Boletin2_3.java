
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float euros;
        double cambio= 1.17;
        System.out.println("Inserte cantidad de euros: ");
        euros= sc.nextFloat();
        System.out.println( euros + " euros es igual a " + (euros*cambio) + " dolares.");
        
    }
    
}
            