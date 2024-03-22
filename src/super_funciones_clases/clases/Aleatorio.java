/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_funciones_clases.clases;

// Antonio Patino
import java.util.Random;
import super_funciones_clases.interfaces.Proveedor;

public class Aleatorio implements Proveedor {
    
    Random random = new Random();
    @Override
    public Integer obtener() {
        return random.nextInt(1000);
    }
}
