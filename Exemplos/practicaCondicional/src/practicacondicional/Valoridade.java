package practicacondicional;

public class Valoridade {
    
    public void comparar(int idade){
        if(idade<0)
            System.out.println("Dato erroneo");
        
        else if(idade>= 30){
            System.out.println("O individuo se considera adulto.");}
             
            else if( 19>= idade)
                    System.out.println(" O individuo se considera xoven.");
                else if(14>= idade)
                        System.out.println("O indidviduo se considera adolescente.");
                     else
                         System.out.println("O individuo se considera neno.");
            
    }
}

