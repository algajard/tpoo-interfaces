/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.IDesplazar;
import interfaces.IDireccionar;

/**
 *
 * @author Maestro 302
 */
public class Bicicleta implements IDireccionar, IDesplazar {

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
    
    public void pedalear() {
        
    }
}
