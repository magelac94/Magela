/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.*;

/**
 *
 * @author Magela
 */
public class Actor extends Persona {
    
    int fechaNacimiento;
    String lugarNacimiento;
    String biografia;
    
    public Actor(Comparable idActor, String nombreActor, int fechaN, String lugarN, String biografia)
    {
        super(idActor,nombreActor);
        fechaNacimiento = fechaN;
        lugarNacimiento = lugarN;
        biografia = biografia;
        
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
