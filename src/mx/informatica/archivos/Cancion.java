/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.informatica.archivos;

import mx.informatica.modelos.Archivo;
import mx.informatica.enumeraciones.ETipo;

/**
 *
 * @author edgar
 */
public class Cancion extends Archivo{

    public Cancion() {
    this.setEtipo(ETipo.AUDIO);
    }
    
}
