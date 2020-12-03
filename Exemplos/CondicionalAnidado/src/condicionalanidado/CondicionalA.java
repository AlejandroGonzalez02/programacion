package condicionalanidado;

public class CondicionalA {
    
    public void amosarDatos(int idade, float peso, String nome){
        if (idade >= 18){
            if(peso>70){
                System.out.println("Idade= "+idade+", peso= "+peso+", nome= "+nome+".");
        }
        System.out.println("Metodo reamatado.");
        }
    }
}
