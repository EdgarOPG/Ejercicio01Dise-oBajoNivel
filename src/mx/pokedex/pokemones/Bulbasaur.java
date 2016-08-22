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
public class Bulbasaur extends Pokemon implements IAtacar{

    public Bulbasaur() {
        this.setEtipo(ETipo.PLANTA);
    }

    @Override
    public void Atacar() {
        System.out.println("Hoja afilada");
    }
    
}
