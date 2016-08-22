/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fabrica.vehiculos;

import mx.fabrica.modelos.Vehiculo;
import mx.fabrica.enumeraciones.EModelosAutos;
import mx.fabrica.interfaces.IDesplazarse;

/**
 *
 * @author edgar
 */
public class Auto extends Vehiculo implements IDesplazarse{
    public Auto() {
        this.setModelo(EModelosAutos.FIESTA);
    }
    
    @Override
    public void desplazar() {
        System.out.println("Correr");
    }

    private void setModelo(EModelosAutos eModelosAutos) {

    }
    
}
