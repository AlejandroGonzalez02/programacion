package practicacondicional;

public class CondicionalMultiple {
    public void amosarDia(int dia){
    
            switch(dia){
            //Tamen podes poñer Strings, numeros,char....
            case 1: System.out.println("LUNS");
                    break;
            case 2: System.out.println("MARTES");
                    break;
            case 3: System.out.println("MERCORES");
                    break;
            case 4: System.out.println("XOVES");
                    break;
            case 5: System.out.println("VENRES");
                    break;
            case 6: System.out.println("SABADO");
                    break;
            case 7: System.out.println("DOMINGO");
                    break;
            default: System.out.println("ERRO");
            }      
    }
}
