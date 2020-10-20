
package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius;
        System.out.println("Intoduce os grados celsius: ");
        celsius =sc.nextFloat();
        System.out.println("Os "+ celsius +"ºC equivalen a:" +"\n" +((celsius*1.8)+32)+"grados Fharenheit. \n"+(celsius+273.15)+"Kelvin.");
    }
    
}
