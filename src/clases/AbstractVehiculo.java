/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Maestro 302
 */
public abstract class AbstractVehiculo {
    
    private Integer numeroRuedas;
    private Integer capacidad;
    private Integer rendimiento;

    public AbstractVehiculo() {
    }

    public AbstractVehiculo(Integer numeroRuedas, Integer capacidad, Integer rendimiento) {
        this.numeroRuedas = numeroRuedas;
        this.capacidad = capacidad;
        this.rendimiento = rendimiento;
    }

    public Integer getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(Integer numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Integer rendimiento) {
        this.rendimiento = rendimiento;
    }
}
