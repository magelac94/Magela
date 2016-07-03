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
public class Director extends Persona{
    
   /* final Comparable idDirector ;
    String nomDirector;
   */ 
    public Director(Comparable idActor, String nomActor)
    {
        super(idActor,nomActor);
        /*this.idDirector=idActor;
        this.nomDirector=nomActor;*/
    }
    
    /*@Override
    public Comparable getId(){
        return this.idDirector;
    }
    
    @Override    
    public String getNombre(){
        return this.nomDirector;
    }*/
}
