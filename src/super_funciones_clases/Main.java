package super_funciones_clases;

import java.util.ArrayList;
import java.util.List;
import super_funciones_clases.clases.AlCuadrado;
import super_funciones_clases.clases.AlCubo;
import super_funciones_clases.clases.Aleatorio;
import super_funciones_clases.clases.Impresor;
import super_funciones_clases.clases.Naturales;
import super_funciones_clases.clases.SoloImpares;
import super_funciones_clases.clases.SoloPares;

    // Antonio Patiño 

public class Main {

        public Main() {
        
        // Crear lista de enteros
        List<Integer> numeros = SuperFunciones.proveer(10, new Naturales());
        System.out.println(numeros);
        // Obtener solo los numeros pares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        // Obtener el cuadrado de cada numero
        //List<Integer> cuadrados = SuperFunciones.transformar(filtrados, new AlCuadrado());
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new AlCubo());
        System.out.println(transformados);
        // Mostrar cada cuadrado por pantalla y retornar lista
        List<Integer> actuados = SuperFunciones.actuar(transformados, new Impresor());
        // Mostrar cada cuadrado por pantalla y no retornar nada
        SuperFunciones.consumir(transformados, new Impresor());
        // Mostrar una suma total de la lista que se mostró
        int total = sumarLista(actuados);
        System.out.println("Suma de cuadrados: " + total);
        
    }
    
    public static void main(String[] args) {
        new Main();
    }

//    private List<Integer> crearLista() {
//        // regresa una lista de numeros enteros
//        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
//    }

//    private List<Integer> filtrarPares(List<Integer> numeros) {
//        List<Integer> resultado = new ArrayList<>();
//        /* recorre la lista numeros y almacena los numeros pares
//        a la lista resultado, la cual es devuelta */
//        for (Integer numero : numeros) {
//            if (numero % 2 == 0) {
//                resultado.add(numero);
//            }
//        }
//        return resultado; 
//    }
    
//    private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
//        List<Integer> resultado = new ArrayList<>();
//        /* recorre la lista numeros eleva al cuadrado cada numero
//        almacenandolo en la lista resultados, la cual es devuelta */
//        for (Integer numero : numeros) {
//            resultado.add(numero * numero);
//        }
//        return resultado; 
//    }
    
//    private List<Integer> mostrarLista (List<Integer> numeros) {
//        // recorre la lista numeros y va imprimiendo cada numero
//        for (Integer numero : numeros) {
//            System.out.println(numero);
//        }
//        return numeros; 
//    }
    
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
