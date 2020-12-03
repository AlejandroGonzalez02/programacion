package nummaioroumenor;

import java.util.Scanner;

public class NumMaiorOuMenor {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Escriba un numero: ");
        a= sc.nextInt();
        System.out.println("Escriba outro numero: ");
        b= sc.nextInt();
        
        CompararmaiorMenor obx=new CompararmaiorMenor();
        obx.comparar(a,b);
    }
    
}
    
