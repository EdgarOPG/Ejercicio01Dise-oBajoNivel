/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.restaurante.platillos;

import mx.restaurante.enumeraciones.ETipo;
import mx.restaurante.interfaces.ICocinar;
import mx.restaurante.modelos.Platillos;

/**
 *
 * @author edgar
 */
public class Sopa extends Platillos implements ICocinar{

    @Override
    public void Cocinar() {
    }

    @Override
    public void setEtipo(ETipo etipo) {
        super.setEtipo(etipo.PLATILLO_FUERTE); //To change body of generated methods, choose Tools | Templates.
    }
}
