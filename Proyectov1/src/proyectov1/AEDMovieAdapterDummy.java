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
public class AEDMovieAdapterDummy implements IAEDMovieAdapter{
    
    //Arrays sin tamano
    private Pelicula [] peliculas;
    private Actor [] actores;
    private ActorPelicula [] actoresPeliculas;
    ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico();    
    @Override

    public void cargarDatos() {
              
        obtenerPeliculas();
        obtenerActores();
        obtenerPeliculasActores();
        
    }
    
    @Override
    public Pelicula[] getPeliculas() {
        return peliculas;
    }
    
    public Actor[] getActores() {
        
        return actores;
    
    }

    public ActorPelicula[] getActorPelicula() {
        
        return actoresPeliculas;
    
    }    

    @Override
    public Pelicula[] obtenerPeliculas() {
        
        String [] archivoPelicula;
        
        archivoPelicula = leoArchivo.leerArchivo("src/proyectov1/Archivos/Small-Peliculas.txt",false);
        peliculas = new Pelicula[archivoPelicula.length];
        
        for(int i = 0; i < archivoPelicula.length;i++ )
        {
            String [] columnas = archivoPelicula[i].split("|");
            
            Pelicula objPelicula = new Pelicula(columnas[0],columnas[1],columnas[2],columnas[3],Integer.parseInt(columnas[4]));
            
            //punto donde explota 
            
            peliculas[i]=objPelicula;
            
        }
                        
        return peliculas;
    }

    @Override
    public Actor[] obtenerActores() {
        
        String [] archivoActor;
                
        archivoActor = leoArchivo.leerArchivo("src/proyectov1/Archivos/Small-Actores.txt",false);
        actores = new Actor[archivoActor.length];
        
        for(int i = 0; i < archivoActor.length;i++ )
        {
            String [] columnas = archivoActor[i].split("|");
            
            Actor objActor = new Actor(Integer.parseInt(columnas[0]),columnas[1]);
            
            
            actores[i]=objActor;
            
        }        
        
        return actores;
    }

    @Override
    public ActorPelicula[] obtenerPeliculasActores() {
        
        String [] archivoRelacion;
                
        archivoRelacion = leoArchivo.leerArchivo("src/proyectov1/Archivos/Small-PeliculasActores.csv",false);
        actoresPeliculas = new ActorPelicula[archivoRelacion.length];
        
        for(int i = 0; i < archivoRelacion.length;i++ )
        {
            String [] columnas = archivoRelacion[i].split("|");
            
             ActorPelicula objActorPelicula = new ActorPelicula(Integer.parseInt(columnas[0]),Integer.parseInt(columnas[1]));
            
            actoresPeliculas[i]=objActorPelicula;
            
        }     
        
        
        return actoresPeliculas;
    }
  
    @Override
    public Pelicula getPelicula(String nombre) {
        Pelicula pelicula=null;
        for(int i=0;i<this.peliculas.length;i++){
            if(this.peliculas[i].getNombre().equals(nombre)){
                pelicula=this.peliculas[i];
            }
        }
        return pelicula;
    }

    
    
    
    /**
    public String obtenerInfoPelicula(String nombrePelicula){
        //todo:
    }
    
    private String getNombreActor(String idActor) {
        //todo:
    }
    */
}
