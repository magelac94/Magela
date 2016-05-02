/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

/**
 *
 * @author Magela
 */
public class ManejadorDePeliculas implements IManejadorDePeliculas {

    /*   public void AgregarPeliculaBD(String dato1, String dato2, String dato3, String dato4, String dato5) {
        Pelicula peliculanueva = new Pelicula(dato1,dato2,dato3,dato4,dato5);
        AgregarEnBD(peliculanueva); 
        
    }
    public void BuscarPelicula(Pelicula pelicula){
     //   BuscarPelicula(pelicula);
    }
    
    // buscar pelicula o  actor.
     */
    private Lista listaPeliculas = new Lista();

    @Override
    public Lista<Pelicula> getLista() {
        return listaPeliculas;
    }

    @Override
    public void insertarPelicula(Pelicula unaPelicula) {
        Nodo<Pelicula> nuevoNodo = new Nodo<>(unaPelicula, unaPelicula.id);
        this.listaPeliculas.insertar(nuevoNodo);
    }

    /**
     * Eliminar productos que ya no se venden (por no ser comercializados m�s).
     *
     * @param clave
     * @return
     */
    @Override
    public boolean eliminarPelicula(Comparable id) {
        return this.listaPeliculas.eliminar(id);
    }

    /**
     * Imprime la lista de productos
     *
     * @return
     */
    @Override
    public String listarPeliculas() {
        this.listaPeliculas.imprimir();
        return "";
    }

    /**
     * Dado un separador ej.:",", ";", imprime los productos separados por tal
     * caracter
     *
     * @param separador
     * @return
     */
    @Override
    public String listarSeparador(String separador) {
        System.out.println(this.listaPeliculas.imprimir(separador));
        return "";
    }

    /**
     * Agregar stock a un producto existente.
     *
     * @param clave
     * @param cantidad
     * @return
     */
    /**
     * Listar todos los productos registrados, ordenados por nombre, presentando
     * adem�s su stock. Imprime por consola la lista de todos los productos
     * registrados y su stock actual.
     */
    @Override
    public void listarOrdenadoPorNombre() {

    }

    @Override
    public void listarOrdenadoPorDescripcion() {

    }

    @Override
    public void listarOrdenadoPorRanking() {

    }

    @Override
    public void listarOrdenadoPorFecha() {

    }

    @Override
    public IPelicula buscarPorCodigo(Comparable codigo) {

        INodo<Pelicula> nodoConPelicula = this.listaPeliculas.buscar(codigo);
        if (nodoConPelicula == null) { //verifica que no sea null
            return null;
        }
        IPelicula producto = nodoConPelicula.getDato();
        return producto;
    }

    /**
     * Busca un producto por su descripci�n.
     *
     * @param descripcion
     * @return
     */
    @Override
    public Pelicula buscarPorDescripcion(String descripcion) {
        INodo<Pelicula> aux = listaPeliculas.getPrimero();

        while (aux != null) {
            if (aux.getDato().getDescripcion().equals(descripcion)) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public Pelicula buscarPorRanking(String ranking) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Pelicula buscarPorFecha(String fecha) {
        INodo<Pelicula> aux = listaPeliculas.getPrimero();

        while (aux != null) {
            if (aux.getDato().getFecha().equals(fecha)) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public Pelicula buscarPorNombre(String nombre) {

        INodo<Pelicula> aux = listaPeliculas.getPrimero();

        while (aux != null) {
            if (aux.getDato().getNombre().equals(nombre)) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    /**
     * Retorna el tama�o del almacen: cantidad de productos. No es lo mismo que
     * el total de stock, sino que ser�a en definitiva el tama�o de la lista.
     *
     * @return
     */
    @Override
    public int cantidadPeliculas() {
        return this.listaPeliculas.cantElementos();
    }
}
