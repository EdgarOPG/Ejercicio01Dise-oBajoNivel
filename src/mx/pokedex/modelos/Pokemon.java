/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.pokedex.modelos;

import mx.pokedex.enumeraciones.ETipo;

/**
 *
 * @author edgar
 */
public class Pokemon {
    private String nombre;
    private ETipo etipo;
    private Integer nivel;

    public Pokemon() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void aumentarNivel() {
        this.nivel++;
    }

    public ETipo getEtipo() {
        return etipo;
    }

    public void setEtipo(ETipo etipo) {
        this.etipo = etipo;
    }
    
    
}
