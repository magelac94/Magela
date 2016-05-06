package PARCIAL1;

/**
 *
 * @author Ernesto
 */
public class Curso implements ICurso {

    private final String NombreCurso;
    private final Conjunto<Alumno> ListaDeClase;

    public Curso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
        this.ListaDeClase = new Conjunto<>();
    }

    @Override
    public String getNombre() {
        return NombreCurso;

    }

   
    @Override
    public IConjunto<Alumno> getListadeClase() {
        return this.ListaDeClase;
    }

    @Override
    public void insertarAlumno(Alumno unAlumno) {
        INodo elNodo = new Nodo<>(unAlumno, unAlumno.getNombre());
        this.ListaDeClase.insertar(elNodo);
    }

    @Override
    public String imprimirAlumnos() {
        return this.ListaDeClase.imprimir();
    }

    @Override
    public String imprimirAlumnosSeparador(String separador) {
        return this.ListaDeClase.imprimir(separador);
    }

    @Override
    public IConjunto<Alumno> noInscriptos(IConjunto todosAlumnos) {
        return this.ListaDeClase.complemento(todosAlumnos);             
    }

  

}
