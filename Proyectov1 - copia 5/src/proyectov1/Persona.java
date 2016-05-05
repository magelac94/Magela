/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IPersona;

/**
 *
 * @author Magela
 */
public class Persona implements IPersona {
    
    final Comparable idPersona ;
    String nomPersona;
    
    public Persona(Comparable idPersona, String nomPersona)
    {
        this.idPersona=idPersona;
        this.nomPersona=nomPersona;
    }
    @Override
    public Comparable getId(){
        return this.idPersona;
    }
    @Override    
    public String getNombre(){
        return this.nomPersona;
    }
}
