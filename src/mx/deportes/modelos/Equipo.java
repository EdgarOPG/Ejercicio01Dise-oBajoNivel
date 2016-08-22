/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.deportes.modelos;

import mx.deportes.enumeraciones.ENacionalidad;

/**
 *
 * @author edgar
 */
public class Equipo {
    private String nombre;
    private ENacionalidad enacionalidad;
    private Integer integrantes;
    private Integer marcador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ENacionalidad getEnacionalidad() {
        return enacionalidad;
    }

    public void setEnacionalidad(ENacionalidad enacionalidad) {
        this.enacionalidad = enacionalidad;
    }

    public Integer getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integer integrantes) {
        this.integrantes = integrantes;
    }

    public Integer getMarcador() {
        return marcador;
    }

    public void setMarcador(Integer marcador) {
        this.marcador = marcador;
    }
   
}
