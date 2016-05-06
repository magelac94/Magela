package PARCIAL1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ernesto
 */
public class Alumno implements IAlumno {

    private final String Nombre;

    public Alumno(String Nombre) {
        
        this.Nombre = Nombre;
    }

    
    @Override
    public String getNombre() {
        return this.Nombre;
    }

}
