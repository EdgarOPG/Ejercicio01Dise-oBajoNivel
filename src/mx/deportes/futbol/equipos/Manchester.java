/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.deportes.futbol.equipos;

import mx.deportes.enumeraciones.ENacionalidad;
import mx.deportes.interfaces.IAnotar;
import mx.deportes.modelos.Equipo;

/**
 *
 * @author edgar
 */
public class Manchester extends Equipo implements IAnotar{

    public Manchester() {
    this.setEnacionalidad(ENacionalidad.UK);
    }

    public Integer anotar() {
        Integer marcador = this.getMarcador();
        return marcador++;
    }
    
}
