/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_funciones_clases.clases;

import super_funciones_clases.interfaces.Consumidor;

/**
 *
 * @author Antonio
 */
public class Impresor implements Consumidor {
    
    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
}
