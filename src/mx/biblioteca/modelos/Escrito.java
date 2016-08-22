/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.biblioteca.modelos;

import java.util.Date;
import mx.biblioteca.enumeraciones.EEditorial;

/**
 *
 * @author edgar
 */
public class Escrito {
    private String titulo;
    private String autor;
    private EEditorial eeditorial;
    private Date fechaPublicacion;

    public EEditorial getEeditorial() {
        return eeditorial;
    }

    public void setEeditorial(EEditorial eeditorial) {
        this.eeditorial = eeditorial;
    }
    
}
