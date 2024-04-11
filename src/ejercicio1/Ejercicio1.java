
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayEnteros = new ArrayList<>();
        int indice;
        int count=0;
        int suma=0;
        
        do{
            indice = (int) (Math.random()*21);
        }while(indice<9);
        
        do{
        arrayEnteros.add((int) (Math.random() * 101));
        count++;
        }while(count!=indice);
        
        for(int i=0; i<arrayEnteros.size(); i++){
            System.out.println(arrayEnteros.get(i));
        }
        
        for(int i=0; i<arrayEnteros.size(); i++){
            suma = suma + arrayEnteros.get(i);
        }
        //Esto es un comentario para la práctica de entornos de desarrollo (GIT)
        System.out.println("La suma de todos los números es: "+suma);
        System.out.println("La media de todos los números es: "+(suma/indice));
        System.out.println("El número máximo de la lista es: "+Collections.max(arrayEnteros));
        System.out.println("El número mínimo de la lista es: "+Collections.min(arrayEnteros));
    }
    
}
