
package ejercicio2;

public class Moneda {
    
    String valor;
    String posicion;
    
    public Moneda(String valor, String posicion){
        this.valor=valor;
        this.posicion=posicion;
    }
   
    public void setValor(String valor){
        this.valor=valor;
    }
    
    public void setPosicion(String posicion){
        this.posicion=posicion;
    }
    
    public String getValor(){
        return valor;
    }
    
    public String getPosicion(){
        return posicion;
    }
    
}
