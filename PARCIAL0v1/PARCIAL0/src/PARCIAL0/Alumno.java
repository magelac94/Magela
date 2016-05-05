package PARCIAL0;

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

    private int codigo;
    private String Nombre;

    public Alumno(int codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    @Override
    public Comparable getCodigo() {
        return this.codigo;
    }

    @Override
    public String getNombre() {
        return this.Nombre;
    }

}
