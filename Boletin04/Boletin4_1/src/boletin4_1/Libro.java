
package boletin4_1;


public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaxinas;
    private float valoracion;
   
    //Constructores de base de inicialización de Libro, autor,ano e numero de paxinas
    public Libro(){}
    public Libro(String t,String au, int a, short n,float v){
        titulo=t;
        autor=au;
        ano=a;
        numPaxinas=n;
        valoracion=v;
    }

    //Metodos de acceso para os atributos
        //Titulo
     public void setTitulo(String t){
        titulo=t;
    }
    public String getTitulo(){
        return titulo;
    }
        //Autor
     public void setAutor(String au){
        autor= au;
    }
    public String getAutor(){
        return autor;
    }
        //Ano
    public void setAno(int a){
        ano= a;
    }
    public int getAno(){
        return ano;
    }
        //numPaxinas
    public void setNumPaxinas(short n){
        numPaxinas= n;
    }
    public short getNumPaxinas(){
        return numPaxinas;
    }
        //valoracion
    public void setValoracion(float v){
        valoracion=v;
    }
    public float getValoracion(){
        return valoracion;
    }
    
    //Amosar
    public void amosar(){
    }
    
}
