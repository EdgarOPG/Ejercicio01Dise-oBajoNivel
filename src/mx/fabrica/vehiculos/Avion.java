/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fabrica.vehiculos;

import mx.fabrica.modelos.Vehiculo;
import mx.fabrica.enumeraciones.EModelosAviones;
import mx.fabrica.interfaces.IDesplazarse;

/**
 *
 * @author edgar
 */
public class Avion extends Vehiculo implements IDesplazarse{

    public Avion() {
        this.setModelo(EModelosAviones.BOEING);
    }
    
    @Override
    public void desplazar() {
        System.out.println("Volar");
    }
    
    private void setModelo(EModelosAviones eModelosAviones) {
    }
    
    
}
