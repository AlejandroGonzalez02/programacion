
package boletin4_1;

import java.util.Scanner;

public class Boletin4_1 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba o titulo do libro: ");
        String t= sc.nextLine();
        System.out.println("Inrtoduce o autor do libro: ");
        String au=sc.nextLine();
        System.out.println("Escriba o ano de publicación do libro: ");
        int a= sc.nextInt();
        System.out.println("Inrtoduce o numero de páxinas: ");
        short n=sc.nextShort();
        System.out.println("Introduzca a sua valoración de maneira numerica do entre 0 a 10: ");
        float v=sc.nextFloat();
        
        System.out.println("Info: "+t+", "+au+", "+a+", "+n+", "+v+".");
    }
    
}
