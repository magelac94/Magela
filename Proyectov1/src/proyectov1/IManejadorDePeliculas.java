package proyectov1;

public interface IManejadorDePeliculas {

    
    public Lista<Pelicula> getLista();
    
    /**
     * Incorporar un nueva pelicula
     *
     * @param unProducto
     */
    public void insertarPelicula(Pelicula unaPelicula);

    /**
     * Eliminar productos que ya no se venden (por no ser comercializados m�s).
     *
     * @param clave
     * @return
     */
    public boolean eliminarPelicula(Comparable id);

    /**
     * Imprime la lista de productos
     *
     * @return
     */
    public String listarPeliculas();

    /**
     * Dado un separador ej.:",", ";", imprime los productos separados por tal
     * caracter
     *
     * @param separador
     * @return
     */
    public String listarSeparador(String separador);

    /**
     * Agregar stock a un producto existente.
     *
     * @param clave
     * @param cantidad
     * @return
     */
   
    public IPelicula buscarPorCodigo(Comparable codigo);

    /**
     * Listar todos los productos registrados, ordenados por nombre, presentando
     * adem�s su stock. Imprime por consola la lista de todos los productos
     * registrados y su stock actual.
     */
    public void listarOrdenadoPorNombre();
    public void listarOrdenadoPorDescripcion();
    public void listarOrdenadoPorRanking();
    public void listarOrdenadoPorFecha();
    /**
     * Busca un producto por su descripci�n.
     *
     * @param descripcion
     * @return
     */
    public Pelicula buscarPorDescripcion(String descripcion);
    public Pelicula buscarPorRanking(String ranking);
    public Pelicula buscarPorFecha(String fecha);
    public Pelicula buscarPorNombre(String nombre);
    
    public Lista <Pelicula> buscarPorNombreLista(String nombre);
    
    
    /**
     * Retorna el tama�o del almacen: cantidad de productos. No es lo mismo que
     * el total de stock, sino que ser�a en definitiva el tama�o de la lista.
     *
     * @return
     */
    public int cantidadPeliculas();
    
    

}
