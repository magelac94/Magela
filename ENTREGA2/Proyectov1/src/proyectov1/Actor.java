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
    
    private String fechaNacimiento;
    private String lugarNacimiento;
    private String biografia;
    
    public Actor(Comparable idActor, String nombreActor, String fechaN, String lugarN, String biografia)
    {
        super(idActor,nombreActor);
        fechaNacimiento = fechaN;
        lugarNacimiento = lugarN;
        this.biografia = biografia;
        
    }
    
    public String getFechaNacimiento(){
        return this.fechaNacimiento;   
    }
    
    public String getLugarNacimiento(){
        return this.lugarNacimiento;
    }
    
    public String getBiografia(){
        return this.biografia;
    }
    
}
