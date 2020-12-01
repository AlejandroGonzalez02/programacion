package com.dam1a.proyectoHelloMundo;

public class Calculos {
    public void suma(){
        int sum=10, num=10;
        for(int i=10;i<=90;i++){
            if(num<=90){
            num=num+1;
            sum= sum+(num);
            System.out.println("O resultado da suma é"+sum);}
            else{
            System.out.println("O resultado da suma é"+sum);}
        }
        System.out.println("A operación xa rematou.");
    }

}
