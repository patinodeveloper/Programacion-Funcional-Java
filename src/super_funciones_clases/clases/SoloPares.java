
package super_funciones_clases.clases;

// Antonio Patino

import super_funciones_clases.interfaces.Predicado;


public class SoloPares implements Predicado{
    
    
    public boolean test(Integer valor) {
        return valor % 2 == 0;
    }
}
