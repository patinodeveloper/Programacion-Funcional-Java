package video.pkg01;

import java.util.ArrayList;
import java.util.List;

    // Antonio Patiño 

public class Video01 {

    public static void main(String[] args) {
        new Video01();
    }

    public Video01() {
        // Crear lista de enteros
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        // Obtener solo los numeros pares
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        // Elevar al cuadrado los numeros pares
        List<Integer> cuadrados = elevarAlCuadrado(pares);
        System.out.println(cuadrados);
        // Mostrar la lista de los numeros elevados al cuadrado
        List<Integer> mostrados = mostrarLista(cuadrados);
        // Mostrar una suma total de la lista que se mostró
        int total = sumarLista(mostrados);
        System.out.println("Suma de cuadrados: " + total);
        
    }

    private List<Integer> crearLista() {
        // regresa una lista de numeros enteros
        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        /* recorre la lista numeros y almacena los numeros pares
        a la lista resultado, la cual es devuelta */
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero);
            }
        }
        return resultado; 
    }
    
    private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        /* recorre la lista numeros eleva al cuadrado cada numero
        almacenandolo en la lista resultados, la cual es devuelta */
        for (Integer numero : numeros) {
            resultado.add(numero * numero);
        }
        return resultado; 
    }
    
    private List<Integer> mostrarLista (List<Integer> numeros) {
        // recorre la lista numeros y va imprimiendo cada numero
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        return numeros; 
    }
    
    private Integer sumarLista (List<Integer> numeros) {
        int total = 0;
        /* recorre la lista numeros y a su vez se van sumando
        y la suma total se almacena en la variable total */
        for (Integer numero : numeros) {
            total += numero;
        }
        return total;
    }
    
}
