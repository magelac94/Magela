package PARCIAL1;

public interface ICurso {
       
    public String getNombre();

    public IConjunto<Alumno> getListadeClase();

    public IConjunto<Alumno> noInscriptos(IConjunto todosAlumnos);

    
    /**
     * Incorporar un nuevo alumno a la lista de clase.
     *
     * @param unAlumno
     */
    public void insertarAlumno(Alumno unAlumno);

    /**
     * Imprime la lista de alumnos
     *
     * @return
     */
    public String imprimirAlumnos();

    /**
     * Dado un separador ej.:",", ";", imprime los alumnos separados por tal
     * caracter
     *
     * @param separador
     * @return
     */
    public String imprimirAlumnosSeparador(String separador);

    
    
}
