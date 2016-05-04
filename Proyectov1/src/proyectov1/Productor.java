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
public class Productor implements IPersona{
    final Comparable idProductor ;
    String nomProductor;
    
    public Productor(Comparable idActor, String nomActor)
    {
        this.idProductor=idActor;
        this.nomProductor=nomActor;
    }
    @Override
    public Comparable getId(){
        return this.idProductor;
    }
    @Override    
    public String getNombre(){
        return this.nomProductor;
    }
}
