/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_funciones_inline_clases;

// Antonio Patino
import super_funciones_clases.*;
import java.util.ArrayList;
import java.util.List;
import super_funciones_clases.interfaces.Consumidor;
import super_funciones_clases.interfaces.Funcion;
import super_funciones_clases.interfaces.FuncionBinaria;
import super_funciones_clases.interfaces.Predicado;
import super_funciones_clases.interfaces.Proveedor;

public class SuperFunciones {

    public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer valor : valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }

    public static List<Integer> actuar(List<Integer> valores, Consumidor consumidor) {
        for (Integer valor : valores) {
            consumidor.aceptar(valor);
        }
        return valores;
    }

    public static void consumir(List<Integer> valores, Consumidor consumidor) {
        for (Integer valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    public static Integer reducir(List<Integer> valores, Integer identidad, FuncionBinaria funcionBinaria) {
        int total = identidad;
        for (Integer valor : valores) {
            total = funcionBinaria.aplicar(total, valor);
        }
        return total;
    }
    
}
