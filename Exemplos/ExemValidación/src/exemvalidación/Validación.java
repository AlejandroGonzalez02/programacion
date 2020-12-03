package exemvalidación;
import java.util.Scanner;
public class Validación {

    public void ValidarDato(){
        int dato;
        do{
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un dato que sexa maior que 0");
        dato = sc.nextInt();
    }while (dato <=0);
    return dato;
    }
}
