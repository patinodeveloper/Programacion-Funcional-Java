/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_funciones_clases;

// Antonio Patino

import java.util.ArrayList;
import java.util.List;
import super_funciones_clases.interfaces.Funcion;
import super_funciones_clases.interfaces.Predicado;
import super_funciones_clases.interfaces.Proveedor;


public class SuperFunciones {
    public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }
    
    public static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }
    
    public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor: valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }
    
}
