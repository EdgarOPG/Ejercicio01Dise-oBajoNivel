/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fabrica.modelos;

import mx.fabrica.enumeraciones.EModelosAutos;

/**
 *
 * @author edgar
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private Double precio;
    private Integer capacidad;
    
    public void arrancar(){
        System.out.println("Brrrm!");
    };

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

}
