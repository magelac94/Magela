/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL0;

/**
 *
 * @author Ernesto
 */
public class Curso implements ICurso {

    private int Anio;
    private int Semestre;
    private String NombreCurso;
    private Lista<Alumno> ListaClase;

    public Curso(String NombreCurso, int Anio, int Semestre) {
        this.Anio = Anio;
        this.Semestre = Semestre;
        this.NombreCurso = NombreCurso;
        this.ListaClase = new Lista<>();

    }

    @Override
    public int getAnio() {
        return this.Anio;
    }

    @Override
    public int getSemestre() {
        return this.Semestre;
    }

    @Override
    public String getNombre() {
        return NombreCurso;

    }

    @Override
    public Lista<Alumno> getListadeClase() {
        return this.ListaClase;
    }

    @Override
    public void insertarAlumno(Alumno unAlumno) {
        Nodo elNodo = new Nodo<Alumno>(unAlumno, unAlumno.getCodigo());
        this.ListaClase.insertar(elNodo);
    }

    @Override
    public String imprimirAlumnos() {
        return this.ListaClase.imprimir();
    }

    @Override
    public String imprimirAlumnosSeparador(String separador) {
        return this.ListaClase.imprimir(separador);
    }

    @Override
    public String listarOrdenadoPorCodigo() {
        this.ListaClase.Ordenar();
        return imprimirAlumnosSeparador(" ; ");

    }

    @Override
    public Alumno buscarPorCodigo(Comparable codigo) {
        return this.ListaClase.buscar(codigo).getDato();
    }

}
