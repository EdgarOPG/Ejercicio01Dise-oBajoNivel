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
public class Libro extends Escrito implements IPublicar{

    public Libro() {
    this.setEeditorial(EEditorial.PLANETA);
    }
    

    @Override
    public void publicar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
