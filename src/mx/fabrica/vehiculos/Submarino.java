/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fabrica.vehiculos;

import mx.fabrica.modelos.Vehiculo;
import mx.fabrica.interfaces.IDesplazarse;

/**
 *
 * @author edgar
 */
public class Submarino extends Vehiculo implements IDesplazarse{

    @Override
    public void desplazar() {
        System.out.println("Sumergirse");
    }
    
}
