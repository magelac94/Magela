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
public class Actor extends Persona {
    
 /*   final Comparable idActor ;
    String nomActor;
 */   
    public Actor(Comparable idActor, String nomActor)
    {
        super(idActor,nomActor);
    }
 /*   @Override
    public Comparable getId(){
        return this.idActor;
    }
    @Override     
    public String getNombre(){
        return this.nomActor;
    }
    */
}
