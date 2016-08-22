/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.restaurante.modelos;

import mx.restaurante.enumeraciones.ETipo;

/**
 *
 * @author edgar
 */
public class Platillos {
    private String Nombre;
    private String Descripcion;
    private Float Precio;
    private ETipo etipo;

    public Platillos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }

    public ETipo getEtipo() {
        return etipo;
    }

    public void setEtipo(ETipo etipo) {
        this.etipo = etipo;
    }
    
    
}
