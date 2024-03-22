/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_funciones_clases.clases;

// Antonio Patino

import super_funciones_clases.interfaces.Predicado;


public class SoloImpares implements Predicado{
    public boolean test(Integer valor) {
        return valor % 2 != 0;
    }
}
