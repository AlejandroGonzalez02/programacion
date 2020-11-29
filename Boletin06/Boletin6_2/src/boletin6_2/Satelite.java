package boletin6_2;

public class Satelite {
    //Atributos
     private double meridiano;
     private double paralelo;
     private double distanciaTerra;
    
    //Constructores
    public Satelite(){
    }

    public Satelite(double m, double p, double d){
    meridiano=m;
    paralelo=p;
    distanciaTerra=d;
    }
    
    //Amosar
    public void amosarPosicion ( ) {
    System.out.println("O satelite atopase  no paralelo "+paralelo + " meridiano " + meridiano +" a unha distancia da terra " + distanciaTerra );
    }
}