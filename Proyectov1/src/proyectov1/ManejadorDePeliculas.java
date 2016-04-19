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

  /*  public void AgregarPeliculaBD(String dato1, String dato2, String dato3, String dato4, String dato5) {
        Pelicula peliculanueva = new Pelicula(dato1,dato2,dato3,dato4,dato5);
     //   AgregarEnBD(peliculanueva);
        
    }
    public void BuscarPelicula(Pelicula pelicula){
     //   BuscarPelicula(pelicula);
    }
    
    // buscar pelicula o  actor.
      */   
    
    @Override
    public void insertarPelicula(Pelicula unaPelicula){
        
    }

    /**
     * Eliminar productos que ya no se venden (por no ser comercializados m�s).
     *
     * @param clave
     * @return
     */
    @Override
    public boolean eliminarPelicula(Comparable id){
        return true;
    }

    /**
     * Imprime la lista de productos
     *
     * @return
     */
    @Override
    public String listarPeliculas(){
        return " ";
    }

    /**
     * Dado un separador ej.:",", ";", imprime los productos separados por tal
     * caracter
     *
     * @param separador
     * @return
     */
    @Override
    public String listarSeparador(String separador){
        return " ";
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
    public void listarOrdenadoPorNombre(){
        
    }
    
    @Override
    public void listarOrdenadoPorDescripcion(){
        
    }
    @Override
    public void listarOrdenadoPorRanking(){
        
    }
    @Override
    public void listarOrdenadoPorFecha(){
        
        
    }
    @Override
     public IPelicula buscarPorCodigo(Comparable codigo){
         
     }
     
     
    /**
     * Busca un producto por su descripci�n.
     *
     * @param descripcion
     * @return
     */
    @Override
    public Pelicula buscarPorDescripcion(String descripcion){
        
    }
    @Override
    public Pelicula[] buscarPorRanking(String ranking){
        
    }
    @Override
    public Pelicula[] buscarPorFecha(String fecha){
        
    }
    @Override
    public Pelicula[] buscarPorNombre(String nombre){
        
    }
    
    
    /**
     * Retorna el tama�o del almacen: cantidad de productos. No es lo mismo que
     * el total de stock, sino que ser�a en definitiva el tama�o de la lista.
     *
     * @return
     */
    @Override
    public int cantidadPeliculas(){
        
    }
}
