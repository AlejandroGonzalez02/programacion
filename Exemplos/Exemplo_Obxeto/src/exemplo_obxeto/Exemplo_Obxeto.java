package exemplo_obxeto;

import java.util.Scanner;


public class Exemplo_Obxeto {

    
    public static void main(String[] args) {
        //instancio un obxeto tiopo Rectangulo
        Rectangulo obxRec1= new Rectangulo();
        obxRec1.amosar();
        Rectangulo obxRec2=new Rectangulo(3f, 5f);
        obxRec2.amosar();
        
        //para amosar os metodos con geyer e setter:
        float resposta = obxRec2.getAltura();
        System.out.println(resposta);
            //Se pode sintetizar en:
        System.out.println(obxRec2.getAltura());
        
        //Darlle un novo valor á altura e a base
        obxRec1.setBase(10f);
        obxRec1.setAltura(11f);
        obxRec1.amosar();
        
        //cacular area
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe a base do rectangulo: ");
        float base= sc.nextFloat();
        System.out.println("Escribe a al do rectangulo: ");
        float altura=sc.nextFloat();
        System.out.println("Area= " +obxRec2.calcularArea(base, altura));
    }
    
}
