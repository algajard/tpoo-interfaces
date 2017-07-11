/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.IDesplazar;
import interfaces.IDireccionar;
import interfaces.IMotor;

/**
 *
 * @author Maestro 302
 */
public class Moto extends AbstractVehiculo implements IMotor, IDireccionar, IDesplazar {
    
    @Override
    public void encenderMotor() {
        
    }

    @Override
    public void apagarMotor() {
        
    }

    @Override
    public void girarDerecha(Integer grados) {
        
    }

    @Override
    public void girarIzquierda(Integer grados) {
        
    }

    @Override
    public void avanzar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void detener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
