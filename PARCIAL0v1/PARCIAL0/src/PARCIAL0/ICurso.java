package PARCIAL0;

public interface ICurso {

    public int getAnio();

    public int getSemestre();

    public String getNombre();

    public Lista<Alumno> getListadeClase();

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

    /**
     * Listar todos los alumnos registrados, ordenados por código de alumno
     */
    public String listarOrdenadoPorCodigo();

    /**
     * Busca un alumno por su codigo.
     *
     * @param codigo
     *
     * @return
     */
    public Alumno buscarPorCodigo(Comparable codigo);

    /**
     *
     */
}
