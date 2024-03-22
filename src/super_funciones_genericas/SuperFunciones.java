/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_funciones_genericas;

// Antonio Patino
import super_funciones_clases.*;
import java.util.ArrayList;
import java.util.List;
import super_funciones_genericas.interfaces.Predicado;
import super_funciones_genericas.interfaces.Proveedor;
import super_funciones_genericas.interfaces.Consumidor;
import super_funciones_genericas.interfaces.Funcion;
import super_funciones_genericas.interfaces.FuncionBinaria;
import super_funciones_genericas.interfaces.OperadorBinario;
        
        
        
        
        
        
public class SuperFunciones {

    public static <T> List<T> filtrar(List<T> valores, Predicado<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static <T> List<T> proveer(int size, Proveedor<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    public static <T, R> List<R> transformar(List<T> valores, Funcion<T, R> funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor : valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }

    public static <T> List<T> actuar(List<T> valores, Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
        return valores;
    }

    public static <T> void consumir(List<T> valores, Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    public static <T> T reducir(List<T> valores, T identidad, OperadorBinario<T> funcionBinaria) {
        T total = identidad;
        for (T valor : valores) {
            total = funcionBinaria.aplicar(total, valor);
        }
        return total;
    }
    
}
