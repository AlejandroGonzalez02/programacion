package exemplo_obxeto;



public class Rectangulo {
    //atributo
    private float base;
    private float altura;
    
    //Constructores
    public Rectangulo(){
    
    }
    public Rectangulo(float b, float al){
    base=b;
    altura=al;
        
    }
    //Metodos de acceso (getters e setters)
        //Base
    public void setBase(float b){
        base= b;
    }
    public float getBase(){
        return base;
    }
        //Altura
    public void setAltura(float al){
        altura= al;
    }
    public float getAltura(){
        return altura;
    }
    
    //metodos para calcular a area do rectangulo e a sua visualizacion
    public float calcularArea(float base, float altura){
        float area;
        area= base*altura;
        return area;
    }
    
    
    //métodos
    public void amosar(){
    System.out.println("base= "+ base + "  altura= "+ altura);
    }
    
}
