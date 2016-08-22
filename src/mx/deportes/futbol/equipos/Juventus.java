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
public class Juventus extends Equipo implements IAnotar{

    public Juventus() {
    this.setEnacionalidad(ENacionalidad.IT);
    }

    
    @Override
    public Integer anotar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
