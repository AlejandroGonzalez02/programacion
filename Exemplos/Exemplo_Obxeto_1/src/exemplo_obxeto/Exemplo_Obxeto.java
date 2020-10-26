package exemplo_obxeto;


public class Exemplo_Obxeto {

    
    public static void main(String[] args) {
        //instancio un obxeto tiopo Rectangulo
        Rectangulo obxRec1= new Rectangulo();
        float altura=  obxRec1.altura;
        System.out.println("altura --> "+altura);
        //As duas sentencias anteriores poden ser simplificadas como:
        System.out.println("altura --> "+obxRec1.altura);
        //Podemos observar a altura xa que na clase rectángulo é pública
        obxRec1.amosar();
        
        
       
        
        
    }
    
}
