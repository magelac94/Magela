/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.INodo;
import interfaces.IManejadorPeliculas;

/**
 *
 * @author Magela
 */
public class ManejadorPeliculas implements IManejadorPeliculas {

    private Lista<Pelicula> listaPeliculas = new Lista();

    @Override
    public Lista<Pelicula> getLista() {
        return listaPeliculas;
    }

    @Override
    public void insertarPelicula(Pelicula unaPelicula) {
        Nodo<Pelicula> nuevoNodo = new Nodo<>(unaPelicula, unaPelicula.getId());
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
    public Pelicula buscarPorCodigo(Comparable codigo) {

        INodo<Pelicula> nodoConPelicula = this.listaPeliculas.buscar(codigo);
        if (nodoConPelicula == null) { //verifica que no sea null
            return null;
        }
        Pelicula peliculaEncontrada = nodoConPelicula.getDato();
        return peliculaEncontrada;
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
    public Pelicula buscarPorFecha(short fecha) {
        INodo<Pelicula> aux = listaPeliculas.getPrimero();

        while (aux != null) {
            if (aux.getDato().getFecha() == fecha) {
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

    @Override
    public Lista<Pelicula> buscarPorNombreLista(String nombreBuscar) {
        if (nombreBuscar != null) {
            IManejadorPeliculas buscopeli = new ManejadorPeliculas(); // creo una listita para las peliculas encontradas

            INodo<Pelicula> aux = listaPeliculas.getPrimero();

            while (aux != null) {
                int estoyNoestoy = aux.getDato().getNombre().toUpperCase().indexOf(nombreBuscar.toUpperCase());
                System.out.println(estoyNoestoy);
                if (estoyNoestoy != -1) {
                    buscopeli.insertarPelicula(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            return buscopeli.getLista();
        } else {
            return listaPeliculas;
        }

    }

    @Override
    public Lista<Pelicula> buscarPorNombreLista(String nombreBuscar, Lista<Pelicula> listaDondeBuscar) {
        if (nombreBuscar != null) {
            IManejadorPeliculas buscopeli = new ManejadorPeliculas(); // creo una listita para las peliculas encontradas

            INodo<Pelicula> aux = listaDondeBuscar.getPrimero();

            while (aux != null) {
                int estoyNoestoy = aux.getDato().getNombre().toUpperCase().indexOf(nombreBuscar.toUpperCase());

                if (estoyNoestoy != -1) {
                    buscopeli.insertarPelicula(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            return buscopeli.getLista();
        } else {
            return listaDondeBuscar;
        }

    }
    @Override
    public Lista<Pelicula> buscarPorGeneroLista(String nombreGenero, Lista<Pelicula> listaDondeBuscar) {
        if (nombreGenero != null) {
            IManejadorPeliculas buscopeli = new ManejadorPeliculas(); // creo una listita para las peliculas encontradas

            INodo<Pelicula> aux = listaDondeBuscar.getPrimero();

            while (aux != null) {
                int estoyNoestoy = aux.getDato().getGenero().toUpperCase().indexOf(nombreGenero.toUpperCase());

                if (estoyNoestoy != -1) {
                    buscopeli.insertarPelicula(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            return buscopeli.getLista();
        } else {
            return listaDondeBuscar;
        }

    }
    

    @Override
    public Lista<Pelicula> buscarPorFechaLista(short fechaBuscar, Lista<Pelicula> listaDondeBuscar) {
        IManejadorPeliculas buscopeli = new ManejadorPeliculas(); // creo una listita para las peliculas encontradas
        INodo<Pelicula> aux = listaDondeBuscar.getPrimero();
        while (aux != null) {
            short fechaPelicula = aux.getDato().getFecha();
            if (fechaPelicula == fechaBuscar) {
                //    int estoyNoestoy = aux.getDato().getFecha().toUpperCase().indexOf(fechaBuscar.toUpperCase());

             //   if (estoyNoestoy != -1) {
                    buscopeli.insertarPelicula(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            return buscopeli.getLista();
        
    }
    @Override
    public Lista<Pelicula> buscarPorFechaLista(short fechaBuscar) {
        System.out.println("Fecha Estreno que paso" + fechaBuscar);

        IManejadorPeliculas buscopeli = new ManejadorPeliculas(); // creo una listita para las peliculas encontradas
        INodo<Pelicula> aux = listaPeliculas.getPrimero();
        while (aux != null) {
            short fechaPelicula = aux.getDato().getFecha();
            if (fechaPelicula == fechaBuscar) {
                //    int estoyNoestoy = aux.getDato().getFecha().toUpperCase().indexOf(fechaBuscar.toUpperCase());

             //   if (estoyNoestoy != -1) {
                    buscopeli.insertarPelicula(aux.getDato());
                    System.out.println("Fecha Estreno" + aux.getDato().getFecha());

                }
                aux = aux.getSiguiente();
            }
            return buscopeli.getLista();
        
    }

    /// NO ordena por ranking solo muestras lo de determinado ranking.-.... estaria bueno ordenar por ranking
    @Override
    public Lista<Pelicula> buscarPorRankingLista(float rankingBuscar, Lista<Pelicula> listaDondeBuscar) {

        IManejadorPeliculas buscopeli = new ManejadorPeliculas(); // creo una listita para las peliculas encontradas

        INodo<Pelicula> aux = listaDondeBuscar.getPrimero();

     //   float rBuscar = Float.parseFloat(rankingBuscar); // es el numero que ingreso solito
       // float pRanking;
        while (aux != null) {
            float pRanking = aux.getDato().getRanking(); // el numero verdadero del ranking

            if (pRanking >= rankingBuscar && pRanking < (rankingBuscar + 1)) {
                System.out.println("Ranking de la Pelicula a COmparar" + pRanking);
                buscopeli.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return buscopeli.getLista();

    }

    @Override
    public Lista<Pelicula> buscaMultiple(String nombreBuscar,short fechaShort2,float rankingBuscar,String generoBuscar){
     
            IManejadorPeliculas resultadoPelicualasEncontradas = new ManejadorPeliculas(); 
            INodo<Pelicula> aux = listaPeliculas.getPrimero();
            
            int existeNombre = -1;
            int existeFecha = -1;
            int existeRanking = -1;
            int existeGenero = -1;
            
            short fechaPelicula = aux.getDato().getFecha();         
            float pRanking = aux.getDato().getRanking(); // el numero verdadero del ranking

            while (aux != null) {  
                if (nombreBuscar != null) {
                    // Si es distinto de -1 es que existe
                    existeNombre = aux.getDato().getNombre().toUpperCase().indexOf(nombreBuscar.toUpperCase()); 
                    if (existeNombre != -1){
                        existeNombre = 1;
                    }
                }else {
                    existeNombre = 1;
                }
                
                    if (fechaShort2 != 0){
                        if (fechaPelicula == fechaShort2) {
                            existeFecha = 1;
                        }else{
                            existeFecha =-1;
                        }
                    }else{
                        existeFecha = 1;
                    }
            
                if (rankingBuscar != 0.0){
                    if(pRanking >= rankingBuscar && pRanking < (rankingBuscar + 1)){
                        existeRanking = 1;
                    }else{
                        existeRanking = -1;
                    }
                }else{
                    existeRanking = 1;
                }
                               
                if (generoBuscar != null) {
                    existeGenero = aux.getDato().getGenero().toUpperCase().indexOf(generoBuscar.toUpperCase());
                    if (existeGenero != -1){
                        existeGenero = 1;
                    }
                }else{
                    existeGenero = 1;
                }
            
                if (existeNombre == 1 && existeFecha == 1 && existeRanking ==1 && existeGenero == 1){
                    resultadoPelicualasEncontradas.insertarPelicula(aux.getDato());
                }               
          
                aux = aux.getSiguiente();
            }
            return resultadoPelicualasEncontradas.getLista();  
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
    
    @Override
    public Lista<Pelicula> buscarPorActorLista(Comparable idActor, Lista<Pelicula> lista){
        IManejadorPeliculas manejaPeliculas = new ManejadorPeliculas();
        INodo<Pelicula> aux = lista.getPrimero();
        while (aux != null) {
            
            if (aux.getDato().existeActor(idActor)){
                manejaPeliculas.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return manejaPeliculas.getLista();
    }
    
    
    public Lista<Pelicula> buscarPorProductorLista(String nombreProductor, Lista<Pelicula> lista){
        IManejadorPeliculas manejaPeliculas = new ManejadorPeliculas();
        INodo<Pelicula> aux = lista.getPrimero();
        while (aux != null) {
            if (aux.getDato().existeActor(nombreProductor)){
                manejaPeliculas.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return manejaPeliculas.getLista();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public Lista<Pelicula> buscarPorDirectorLista(String nombreDirector, Lista<Pelicula> lista){
        IManejadorPeliculas manejaPeliculas = new ManejadorPeliculas();
        INodo<Pelicula> aux = lista.getPrimero();
        while (aux != null) {
            if (aux.getDato().existeActor(nombreDirector)){
                manejaPeliculas.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return manejaPeliculas.getLista();
    }
    
    public Lista<Pelicula> peliculasQueContieneActor(Comparable unActor){
        IManejadorPeliculas manejaPeliculas = new ManejadorPeliculas();
        INodo<Pelicula> aux = listaPeliculas.getPrimero();
        while (aux != null) {
            if (aux.getDato().existeActor(unActor)){
                manejaPeliculas.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return manejaPeliculas.getLista();

    }
    public Lista<Pelicula> peliculasQueContieneProductor(Comparable unProductor){
        IManejadorPeliculas manejaPeliculas = new ManejadorPeliculas();
        INodo<Pelicula> aux = listaPeliculas.getPrimero();
        while (aux != null) {
            if (aux.getDato().existeProductor(unProductor)){
                manejaPeliculas.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return manejaPeliculas.getLista();

    }
    
    public Lista<Pelicula> peliculasQueContieneDirector(Comparable unDirector){
        IManejadorPeliculas manejaPeliculas = new ManejadorPeliculas();
        INodo<Pelicula> aux = listaPeliculas.getPrimero();
        while (aux != null) {
            if (aux.getDato().existeDirector(unDirector)){
                manejaPeliculas.insertarPelicula(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        return manejaPeliculas.getLista();

    }
    
   
    
  
}
