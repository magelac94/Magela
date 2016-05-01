/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopeliculas;

/**
 *
 * @author Josse
 */
public class AdaptadorInterfaz implements IAEDMovieAdapter{
    
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
        
        archivoPelicula = leoArchivo.leerArchivo("src/proyectopeliculas/Small-PeliculasComas.txt",false);
        peliculas = new Pelicula[archivoPelicula.length];
        
        for(int i = 0; i < archivoPelicula.length;i++ )
        {   System.out.println("ArchivoPelicula  antes split: " + archivoPelicula[i]);
            String [] columnas = archivoPelicula[i].split("\\|");
            System.out.println("ArchivoPelicula despues split: " + archivoPelicula[i]);
            
            System.out.println("Columna 1> "+ columnas[0]+" columna 2"+columnas[1]);

            Pelicula objPelicula = new Pelicula(Integer.parseInt(columnas[0]),columnas[1],columnas[2],columnas[3],columnas[4]);
            System.out.println("Pelicula Agregada: " + " ID:" +columnas[0] + " Nombre:" +columnas[1]+ " Año:" + columnas[2] );

            //punto donde explota 
            
            peliculas[i]=objPelicula;
            
        }
                        
        return peliculas;
    }

    @Override
    public Actor[] obtenerActores() {
        
        String [] archivoActor;
                
        archivoActor = leoArchivo.leerArchivo("src/proyectopeliculas/Actores.csv",false);
        actores = new Actor[archivoActor.length];
        
        for(int i = 0; i < archivoActor.length;i++ )
        {
            String [] columnas = archivoActor[i].split(",");
            
            Actor objActor = new Actor(Integer.parseInt(columnas[0]),columnas[1]);
            
            
            actores[i]=objActor;
            
        }        
        
        return actores;
    }

    @Override
    public ActorPelicula[] obtenerPeliculasActores() {
        
        String [] archivoRelacion;
                
        archivoRelacion = leoArchivo.leerArchivo("src/proyectopeliculas/PeliculasActores.csv",false);
        actoresPeliculas = new ActorPelicula[archivoRelacion.length];
        
        for(int i = 0; i < archivoRelacion.length;i++ )
        {
            String [] columnas = archivoRelacion[i].split(",");
            
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
