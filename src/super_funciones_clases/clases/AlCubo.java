/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_funciones_clases.clases;

import super_funciones_clases.interfaces.Funcion;

/**
 *
 * @author Antonio
 */
public class AlCubo implements Funcion{
    
        @Override
    public Integer aplicar(Integer valor) {
        return valor * valor * valor;
    }
}
