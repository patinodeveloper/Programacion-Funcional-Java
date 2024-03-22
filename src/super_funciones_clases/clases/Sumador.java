/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_funciones_clases.clases;

import super_funciones_clases.interfaces.FuncionBinaria;

/**
 *
 * @author Antonio
 */
public class Sumador implements FuncionBinaria{
    
    @Override
    public Integer aplicar(Integer valor1, Integer valor2){
        return valor1 + valor2;
    }
}
