
package boletin5_1;

import java.util.Scanner;

public class Boletin5_1 {

    
    public static void main(String[] args) {
        //Creo obxecto
        Consumo obxCon= new Consumo();
        obxCon.amosar();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba os kilometros percorruidos polo coche: ");
        float kM= sc.nextFloat();
        System.out.println("Introduzca avelocidade media: ");
        float vM=sc.nextFloat();
        
        System.out.println("Info: "+obxCon+".");
    }
    
}
