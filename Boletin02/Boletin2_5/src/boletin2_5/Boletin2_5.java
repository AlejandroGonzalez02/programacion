
package boletin2_5;

import java.util.Scanner;
        
public class Boletin2_5 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float millas;
       float cambio=1852;
       System.out.println("Introduce las millas: ");
       millas= sc.nextFloat();
       System.out.println( millas + " millas equivale a "+ (millas*cambio)+ " metros.");
    }
    
}
