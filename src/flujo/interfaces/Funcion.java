/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujo.interfaces;

/**
 * @author Antonio Patino
 */
public interface Funcion <T, R> {
    R aplicar(T valor);
}
