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
public class Actor implements IPersona {
    
    final Comparable idActor ;
    String nomActor;
    
    public Actor(Comparable idActor, String nomActor)
    {
        this.idActor=idActor;
        this.nomActor=nomActor;
    }
    @Override
    public Comparable getId(){
        return this.idActor;
    }
    @Override     
    public String getNombre(){
        return this.nomActor;
    }
    
}
