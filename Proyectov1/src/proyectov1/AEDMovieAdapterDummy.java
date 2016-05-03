/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

/**
 *
 * @author Josse
 */
public class AEDMovieAdapterDummy implements IAEDMovieAdapter {

    //Arrays sin tamano
    private IManejadorDePeliculas manejadorPeliculas;
    
    private Actor[] actores;

    private ActorPelicula[] actoresPeliculas;
    ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico();

    public AEDMovieAdapterDummy(){
        manejadorPeliculas = new ManejadorDePeliculas();
    }
    @Override

    public void cargarDatos() {

        obtenerPeliculas();
        obtenerActores();
        obtenerPeliculasActores();

    }

    @Override
    public Lista<Pelicula> getPeliculas() {
        return manejadorPeliculas.getLista();
    }
    
    @Override
    public IManejadorDePeliculas getManejador(){
        return manejadorPeliculas;
    }

    @Override
    public Lista<Actor> getActores() {
        return null;
        // return actores;

    }

    @Override
    public Lista<ActorPelicula> getActorPelicula() {
        return null;
        //  return actoresPeliculas;

    }
    @Override
    public Pelicula buscarPorNombre(String nombre) {
        return manejadorPeliculas.buscarPorNombre(nombre);
    }
    
    @Override
    public Lista<Pelicula> buscarPorNombreLista(String nombre){
        return manejadorPeliculas.buscarPorNombreLista(nombre);
    }
    @Override
    public Lista<Pelicula>buscarPorFechaLista(String nombre, Lista<Pelicula> lista){
        return manejadorPeliculas.buscarPorFechaLista(nombre,lista);
    }
    
    @Override
    public Lista<Pelicula>buscarPorRankingLista(String ranking, Lista<Pelicula> lista){
        return manejadorPeliculas.buscarPorRankingLista(ranking, lista);
    }
    @Override
    public Lista<Pelicula> obtenerPeliculas() {

        String[] archivoPelicula;
        archivoPelicula = leoArchivo.leerArchivo("src/proyectov1/Archivos/Small-Peliculas.txt", false);
        manejadorPeliculas = new ManejadorDePeliculas();
        for (int i = 0; i < archivoPelicula.length; i++) {
            String[] columnas = archivoPelicula[i].split("\\|");
            Pelicula objPelicula = new Pelicula(Integer.parseInt(columnas[0]), columnas[1], columnas[2], columnas[3], columnas[4]);
            manejadorPeliculas.insertarPelicula(objPelicula);
        }
        return manejadorPeliculas.getLista();
    }

    @Override
    public Lista<Actor> obtenerActores() {

        String[] archivoActor;

        archivoActor = leoArchivo.leerArchivo("src/proyectov1/Archivos/Small-Actores.txt", false);
        actores = new Actor[archivoActor.length];

        for (int i = 0; i < archivoActor.length; i++) {
            String[] columnas = archivoActor[i].split("|");

            Actor objActor = new Actor(Integer.parseInt(columnas[0]), columnas[1]);

            actores[i] = objActor;

        }
        return null;
        //  return actores;
    }

    @Override
    public Lista<ActorPelicula> obtenerPeliculasActores() {

        String[] archivoRelacion;

        archivoRelacion = leoArchivo.leerArchivo("src/proyectov1/Archivos/Small-PeliculasActores.txt", false);
        actoresPeliculas = new ActorPelicula[archivoRelacion.length];

        for (int i = 0; i < archivoRelacion.length; i++) {
            String[] columnas = archivoRelacion[i].split("|");

            ActorPelicula objActorPelicula = new ActorPelicula(Integer.parseInt(columnas[0]), Integer.parseInt(columnas[1]));

            actoresPeliculas[i] = objActorPelicula;

        }
        return null;
        // return actoresPeliculas;
    }

    @Override
    public Pelicula getPelicula(String nombre) {
        
        Pelicula peli = manejadorPeliculas.buscarPorNombre(nombre);
        return peli;
        
        /*datosPelicula = ""
        for (int i = 0; i < this.peliculas.length; i++) {
            if (this.peliculas[i].getNombre().equals(nombre)) {
                pelicula = this.peliculas[i];
            }
        }
        return pelicula;*/
    }

    /**
     * public String obtenerInfoPelicula(String nombrePelicula){ //todo: }
     *
     * private String getNombreActor(String idActor) { //todo: }
     */
}
