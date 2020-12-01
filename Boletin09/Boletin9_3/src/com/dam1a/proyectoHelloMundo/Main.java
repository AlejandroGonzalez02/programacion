package com.dam1a.proyectoHelloMundo;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Rectangulo rec= new Rectangulo();
        Scanner sc= new Scanner(System.in);
        float base, altura;
        do{
            System.out.println("Introduce a base: ");
            base=sc.nextFloat();
        }while(base<=0);
        do{
            System.out.println("Introduce a altura: ");
            altura=sc.nextFloat();
        }

    }
}
