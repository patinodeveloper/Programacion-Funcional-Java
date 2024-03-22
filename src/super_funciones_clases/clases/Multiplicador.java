
package super_funciones_clases.clases;

import super_funciones_clases.interfaces.FuncionBinaria;

/**
 *
 * @author Antonio
 */
public class Multiplicador implements FuncionBinaria{

    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }

}
