package flujo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import flujo.interfaces.Predicado;
import flujo.interfaces.Proveedor;
import flujo.interfaces.Consumidor;
import flujo.interfaces.Funcion;
import flujo.interfaces.FuncionBinaria;
import flujo.interfaces.OperadorBinario;
import flujo.interfaces.OperadorUnario;

// Antonio Patiño 
public class Main {

    public Main() {
//      Integer total = new Flujo(List.of(1, 2, 3, 4, 5, 6, 7, 8))
        Integer total = 
                Flujo.proveer(10, new Proveedor<Integer>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        }).filtrar(new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        }).transformar(new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        }).actuar(new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        }).reducir(0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        // SE PUEDE BORRAR
//        // Crear lista de enteros
//        //List<Integer> numeros = SuperFunciones.proveer(10, new Naturales());
//        Flujo<Integer> numeros = Flujo.proveer(10, new Proveedor<>() {
//            Random random = new Random();
//
//            @Override
//            public Integer obtener() {
//                return random.nextInt(10);
//            }
//        });
//        System.out.println(numeros);
//        // Obtener solo los numeros pares
//        Flujo<Integer> filtrados = numeros.filtrar(new Predicado<>() {
//            @Override
//            public boolean test(Integer valor) {
//                return valor % 2 == 0;
//            }
//        });
//        System.out.println(filtrados);
//        // Obtener el cuadrado de cada numero
//        //List<Integer> cuadrados = SuperFunciones.transformar(filtrados, new AlCuadrado());
//        Flujo<Integer> transformados = filtrados.transformar(new OperadorUnario<>() {
//            @Override
//            public Integer aplicar(Integer valor) {
//                return valor * valor;
//            }
//        });
//        System.out.println(transformados);
//        // Obtener cada numero convertido en cadena
//        Flujo<String> convertidosEnCadena = filtrados.transformar(new Funcion<Integer, String>() {
//            @Override
//            public String aplicar(Integer valor) {
//                return "Valor: " + valor;
//            }
//        });
//        System.out.println(convertidosEnCadena);
//        Consumidor<Integer> impresor = new Consumidor<>() {
//            @Override
//            public void aceptar(Integer valor) {
//                System.out.println(valor);
//            }
//        };
//        Flujo<Integer> actuados = transformados.actuar(impresor);
//        // Mostrar cada cuadrado por pantalla y no retornar nada
//        transformados.consumir(impresor);
//        // Mostrar una suma total de la lista que se mostró
//        //int total = SuperFunciones.reducir(actuados, 0, new Sumador());
//        Integer total = actuados.reducir(0, new OperadorBinario<>() {
//            @Override
//            public Integer aplicar(Integer valor1, Integer valor2) {
//                return valor1 + valor2;
//            }
//        });
        System.out.println("Reduccion: " + total);

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
//    private Integer sumarLista(List<Integer> numeros) {
//        int total = 0;
//        /* recorre la lista numeros y a su vez se van sumando
//        y la suma total se almacena en la variable total */
//        for (Integer numero : numeros) {
//            total += numero;
//        }
//        return total;
//    }
}
