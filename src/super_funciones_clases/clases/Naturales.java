/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_funciones_clases.clases;

import super_funciones_clases.interfaces.Proveedor;

/**
 * @author Antonio Patino
 */
public class Naturales implements Proveedor {
    
    private static int next = 0;
    
    public Integer obtener() {
        return next++;
    }
}
