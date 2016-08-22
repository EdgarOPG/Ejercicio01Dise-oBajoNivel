/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.pokedex.pokemones;

import mx.pokedex.modelos.Pokemon;
import mx.pokedex.enumeraciones.ETipo;
import mx.pokedex.interfaces.IAtacar;

/**
 *
 * @author edgar
 */
public class Squirtle extends Pokemon implements IAtacar{

    public Squirtle() {
        this.setEtipo(ETipo.AGUA);
    }
    
    @Override
    public void Atacar() {
        System.out.println("Burbujas");
    }
    
}
