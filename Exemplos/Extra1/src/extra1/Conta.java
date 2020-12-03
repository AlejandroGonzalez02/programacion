
package extra1;


public class Conta {
    //Atributo
    private String titulo;
    private String conta;
    private double interese;
    private double saldo;
    
    //Constructores
    public Conta(){
    }
    public Conta(String t, String c, double i, double s){
        titulo=t;
        conta=c;
        interese=i;
        saldo=s;
    }
    
    //Métodos
        //Titulo
    public void setTitulo(String t){
        titulo=t;
    }
    public String getTitulo(){
        return titulo;   
    }
        //Conta
    public void setConta(String c){
        conta=c;
    }
    public String getConta(){
        return conta;
    }
        //Interese
    public void setInterese(double i){
        interese=i;
    }
    public double getIneterese(){
        return interese;
    }
        //Saldo
    public void setSaldo(double s){
        saldo=s;
    }
    public double getSaldo(){
        return saldo;
    }
}