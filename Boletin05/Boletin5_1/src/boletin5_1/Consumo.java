package boletin5_1;


public class Consumo {
    //Atributos
        private float kilometros;
        private float litros;
        private float velocidadeMedia;
        private float prezoGasolina;
        
    //Constructores
        public Consumo(){}
        public Consumo(float km, float l,float vM,float pGas,float t){
        kilometros=km;
        litros=l;
        velocidadeMedia=vM;
        prezoGasolina=pGas;
        }
        
    //Métodos
        public void setKilometros(float km){
        kilometros=km;
    }
        public void setVelocidadeMedia(float vM){
        velocidadeMedia=vM;
        }
        
        public float calcularTempo(float kilometros, float velocidadeMedia){
        float t;
        t=(kilometros/velocidadeMedia);
        return t;
    
    //amosar
    public void amosar(){
    System.out.println("tempo= "+t);
    }
    }
        
        
}
