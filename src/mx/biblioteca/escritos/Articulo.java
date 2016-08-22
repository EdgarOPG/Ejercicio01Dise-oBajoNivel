/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.biblioteca.escritos;

import mx.biblioteca.enumeraciones.EEditorial;
import mx.biblioteca.interfaces.IPublicar;
import mx.biblioteca.modelos.Escrito;

/**
 *
 * @author edgar
 */
public class Articulo extends Escrito implements IPublicar{

    public Articulo() {
    this.setEeditorial(EEditorial.ITESO);
    }

    @Override
    public void publicar() {
        System.out.println("");
    }
    
}
