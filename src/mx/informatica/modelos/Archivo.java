/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.informatica.modelos;

import mx.informatica.enumeraciones.ETipo;

/**
 *
 * @author edgar
 */
public class Archivo {
    private String nombre;
    private ETipo etipo;
    private Double peso;
    private String ubicacion;

    public Archivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ETipo getEtipo() {
        return etipo;
    }

    public void setEtipo(ETipo etipo) {
        this.etipo = etipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
