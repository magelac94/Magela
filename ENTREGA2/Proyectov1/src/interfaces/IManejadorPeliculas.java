package interfaces;

import proyectov1.*;

public interface IManejadorPeliculas {

    
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
   
    public Pelicula buscarPorCodigo(Comparable codigo);

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
    public Pelicula buscarPorFecha(short fecha);
    public Pelicula buscarPorNombre(String nombre);
   
    
    public Lista<Pelicula> buscarPorNombreLista(String nombreBuscar);
    public Lista<Pelicula> buscarPorNombreLista(String nombreBuscar, Lista<Pelicula> listaDondeBuscar);
    public Lista<Pelicula> buscarPorFechaLista(short fechaBuscar, Lista<Pelicula> listaDondeBuscar) ;
    public Lista<Pelicula> buscarPorRankingLista(float rankingBuscar, Lista<Pelicula> listaDondeBuscar);
    public Lista<Pelicula> buscarPorFechaLista(short fechaBuscar) ;
    public Lista<Pelicula> buscarPorGeneroLista(String nombreGenero, Lista<Pelicula> listaDondeBuscar); 
    
    
    public Lista<Pelicula> buscaMultiple(String nombre,short fecha,float ranking,String genero);
    public Lista<Pelicula> buscaMultipleConActor(String nombreBuscar,short fechaShort2,float rankingBuscar,String generoBuscar,Comparable idActor);

    
    public Lista<Pelicula> buscarPorActorLista(Comparable nombreGenero, Lista<Pelicula> listaDondeBuscar); 
    public Lista<Pelicula> buscarPorProductorLista(String nombreGenero, Lista<Pelicula> listaDondeBuscar); 
    public Lista<Pelicula> buscarPorDirectorLista(String nombreGenero, Lista<Pelicula> listaDondeBuscar); 
    /**
     * Retorna el tama�o del almacen: cantidad de productos. No es lo mismo que
     * el total de stock, sino que ser�a en definitiva el tama�o de la lista.
     *
     * @return
     */
    public int cantidadPeliculas();
    
    

}
