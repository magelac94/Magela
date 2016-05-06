/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import auxiliares.ManejadorArchivosGenerico;
import interfaces.IAEDMovieAdapter;
import interfaces.INodo;
import javax.swing.JOptionPane;
import interfaces.IManejadorPeliculas;

/**
 *
 * @author Magela
 */
public class AEDMovieAdapterDummy implements IAEDMovieAdapter {

    //Arrays sin tama;o
    private IManejadorPeliculas manejadorPeliculas; // para las lineas del documentoq
    //  private Actor[] actores;  // para las lineas del documento
    //  private ActorPelicula[] actoresPeliculas; // para las lineas del documento
    private ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico();
    private ManejadorActores manejadorActores;
    private ManejadorProductores manejadorProductores;
    private ManejadorDirectores manejadorDirectores;
    
    public AEDMovieAdapterDummy() {
        manejadorPeliculas = new ManejadorPeliculas();
        manejadorActores = new ManejadorActores();
        manejadorProductores = new ManejadorProductores();
        manejadorDirectores = new ManejadorDirectores();
        
    }
    
    @Override
    
    public void cargarDatos() {
        obtenerPeliculas();
        obtenerActores();
        obtenerPeliculasActores();
        //  obtenerPeliculasProductores(); Revisar
        //  obtenerPeliculasDirectores(); revisar

    }
    
    @Override
    public Lista<Pelicula> getPeliculas() {
        return manejadorPeliculas.getLista();
    }
    
    @Override
    public IManejadorPeliculas getManejador() {
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
    public Lista<Pelicula> buscarPorNombreLista(String nombre) {
        return manejadorPeliculas.buscarPorNombreLista(nombre);
    }
    
    @Override
    public Lista<Pelicula> buscarPorFechaLista(short fecha, Lista<Pelicula> lista) {
        return manejadorPeliculas.buscarPorFechaLista(fecha, lista);
    }
    
    @Override
    public Lista<Pelicula> buscarPorFechaLista(short fecha) {
        return manejadorPeliculas.buscarPorFechaLista(fecha);
    }
    
    @Override
    public Lista<Pelicula> buscarPorRankingLista(float ranking, Lista<Pelicula> lista) {
        return manejadorPeliculas.buscarPorRankingLista(ranking, lista);
    }
    
    @Override
    public Lista<Pelicula> buscarPorGeneroLista(String unGenero, Lista<Pelicula> lista) {
        return manejadorPeliculas.buscarPorGeneroLista(unGenero, lista);
    }
    
    @Override
    public Lista<Pelicula> buscarPorActorLista(String nombreActor, Lista<Pelicula> listaDondeBuscar) {
        if (nombreActor != null) { // se complico hacerlo en actores....... tengo que cambiarlo despues
            
            ManejadorActores buscoactor = new ManejadorActores(); // creo una lista para las peliculas encontradas
            ManejadorPeliculas peliculasEncontradas = new ManejadorPeliculas(); // creo una lista para las peliculas encontradas
            INodo<Persona> aux = manejadorActores.getLista().getPrimero();
            
            while (aux != null) {
                int estoyNoestoy
                        = aux.getDato().getNombre().toUpperCase().indexOf(nombreActor.toUpperCase());
                if (estoyNoestoy != -1) {
                    buscoactor.insertarPersona(aux.getDato());
                }
                aux = aux.getSiguiente();
            }   
            
            INodo<Persona> auxActor = buscoactor.getLista().getPrimero(); // Actores recorro
            INodo<Pelicula> auxPelicula = listaDondeBuscar.getPrimero();
            
            while (auxActor != null) { // actores
                while (auxPelicula != null) { // peliculas
                    if (auxPelicula.getDato().existeActor(auxActor.getEtiqueta())) { 
                        peliculasEncontradas.insertarPelicula(auxPelicula.getDato());
                    }
                    auxPelicula = auxPelicula.getSiguiente();
                }
                auxActor = auxActor.getSiguiente();
            }
            
        }
        return peliculasEncontradas.getLista();
    }
    
    
    @Override
    public Lista<Pelicula> buscarPorProductorLista(String nombreProductor, Lista<Pelicula> lista) {
        return manejadorPeliculas.buscarPorActorLista(nombreProductor, lista);
    }
    
    @Override
    public Lista<Pelicula> buscarPorDirectorLista(String nombreDirector, Lista<Pelicula> lista) {
        return manejadorPeliculas.buscarPorActorLista(nombreDirector, lista);
    }
    
    @Override
    public Lista<Pelicula> obtenerPeliculas() {
        String[] archivoPelicula;
        archivoPelicula = leoArchivo.leerArchivo("src/proyectov1/Archivos/Big-Peliculas.csv", false);
        //   manejadorPeliculas = new ManejadorPeliculas();
        for (int i = 0; i < archivoPelicula.length; i++) {
            try {
                String[] columnas = archivoPelicula[i].split("\\|");
                Pelicula objPelicula = new Pelicula(Integer.parseInt(columnas[0]),
                        columnas[1], Short.parseShort(columnas[2]),
                        Float.parseFloat(columnas[3]), columnas[4],
                        columnas[5]);
                manejadorPeliculas.insertarPelicula(objPelicula);
            } catch (Exception e) {
                //            JOptionPane.showMessageDialog(null, "¡Error en Formato de Archivo!\n Pelicula No Ingresada: " + archivoPelicula[i]);
                System.out.println("¡Error en Formato de Archivo!\n Pelicula No Ingresada: ");
            }
        }
        return manejadorPeliculas.getLista();
    }
    
    @Override
    public Lista<Persona> obtenerActores() {
        String[] archivoActor;
        archivoActor = leoArchivo.leerArchivo("src/proyectov1/Archivos/Big-Actores.csv", false);

        //  manejadorActores = new ManejadorPeliculas();
        for (int i = 0; i < archivoActor.length; i++) {
            try {
                String[] columnas = archivoActor[i].split("\\|");
                Actor objActor = new Actor(Integer.parseInt(columnas[0]), columnas[1]);
                manejadorActores.insertarPersona(objActor);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Error en Formato de Archivo!\n Actor No Ingresado: " + archivoActor[i]);
                System.out.println("¡Error en Formato de Archivo!\n Actor No Ingresado: ");
            }
        }
        return manejadorActores.getLista();
    }
    
    @Override
    public void obtenerPeliculasActores() {
        String[] archivoRelacion;
        archivoRelacion = leoArchivo.leerArchivo("src/proyectov1/Archivos/Big-PeliculasActores.csv", false);
        //actoresPeliculas = new ActorPelicula[archivoRelacion.length];
        Pelicula buscarPelicula;
        for (int i = 0; i < archivoRelacion.length; i++) {
            try {
                String[] columnas = archivoRelacion[i].split("\\|");
                int idPelicula = Integer.parseInt(columnas[0]);
                int idActor = Integer.parseInt(columnas[1]);
                try {
                    
                    buscarPelicula = manejadorPeliculas.buscarPorCodigo(idPelicula);
                    try {
                        manejadorActores.buscarPorCodigo(idActor); // ??
                        try {
                            buscarPelicula.agregarActor(idActor); // Agrego al actor a la pelicula entrada
                        } catch (Exception e) {
                            System.out.println("No se pudo agregar bien los datos del actor la pelicula>: " + idPelicula);
                        }
                    } catch (Exception e) {
                        System.out.println("Actor no Encontrado: " + idActor);
                    }
                } catch (Exception e) {
                    System.out.println("PELICULA NO ENCONOTRADA: " + idPelicula);
                }
                
            } catch (Exception e) {
                //      JOptionPane.showMessageDialog(null, "No se encontro la pelicula " + idPelicula);
                JOptionPane.showMessageDialog(null, "El formato del Archivo Pelicula-Actor no tiene el formato valido\n"
                        + "Relacion: " + archivoRelacion[i] + "no ingresado al sistema");
            }
            
        }
        
    }
    
    public void obtenerPeliculasProductores() {
        String[] archivoRelacion;
        archivoRelacion = leoArchivo.leerArchivo("src/proyectov1/Archivos/Big-PeliculasProductores.csv", false);
        //actoresPeliculas = new ActorPelicula[archivoRelacion.length];
        Pelicula buscarPelicula;
        for (int i = 0; i < archivoRelacion.length; i++) {
            try {
                String[] columnas = archivoRelacion[i].split("\\|");
                int idPelicula = Integer.parseInt(columnas[0]);
                int idProductor = Integer.parseInt(columnas[1]);
                try {
                    
                    buscarPelicula = manejadorPeliculas.buscarPorCodigo(idPelicula);
                    try {
                        manejadorProductores.buscarPorCodigo(idProductor); // ??
                        try {
                            buscarPelicula.agregarProductor(idProductor); // Agrego al actor a la pelicula entrada
                        } catch (Exception e) {
                            System.out.println("No se pudo agregar bien los datos del actor la pelicula>: " + idPelicula);
                        }
                    } catch (Exception e) {
                        System.out.println("Productor no Encontrado: " + idProductor);
                    }
                } catch (Exception e) {
                    System.out.println("PELICULA NO ENCONOTRADA: " + idPelicula);
                }
                
            } catch (Exception e) {
                //      JOptionPane.showMessageDialog(null, "No se encontro la pelicula " + idPelicula);
                JOptionPane.showMessageDialog(null, "El formato del Archivo Pelicula-Productor no tiene el formato valido\n"
                        + "Relacion: " + archivoRelacion[i] + "no ingresada al sistema");
            }
        }
    }
    
    public void obtenerPeliculasDirectores() {
        String[] archivoRelacion;
        archivoRelacion = leoArchivo.leerArchivo("src/proyectov1/Archivos/Big-PeliculasDirectores.csv", false);
        //actoresPeliculas = new ActorPelicula[archivoRelacion.length];
        Pelicula buscarPelicula;
        for (int i = 0; i < archivoRelacion.length; i++) {
            try {
                String[] columnas = archivoRelacion[i].split("\\|");
                int idPelicula = Integer.parseInt(columnas[0]);
                int idDirector = Integer.parseInt(columnas[1]);
                try {
                    
                    buscarPelicula = manejadorPeliculas.buscarPorCodigo(idPelicula);
                    try {
                        manejadorDirectores.buscarPorCodigo(idDirector); // ??
                        try {
                            buscarPelicula.agregarDirector(idDirector); // Agrego al actor a la pelicula entrada
                            System.out.println("Productor agregado correctamente " + idDirector);
                        } catch (Exception e) {
                            System.out.println("No se pudo agregar bien los datos del actor la pelicula, contacte con el Administrador: " + idPelicula);
                        }
                    } catch (Exception e) {
                        System.out.println("Director no Encontrado: " + idDirector);
                    }
                } catch (Exception e) {
                    System.out.println("PELICULA NO ENCONOTRADA: " + idPelicula);
                }
                
            } catch (Exception e) {
                //      JOptionPane.showMessageDialog(null, "No se encontro la pelicula " + idPelicula);
                JOptionPane.showMessageDialog(null, "El formato del Archivo Pelicula-Director no tiene el formato valido\n"
                        + "Relacion: " + archivoRelacion[i] + "no ingresada al sistema");
            }
        }
    }
    
    @Override
    public Pelicula getPelicula(String nombre) {
        
        Pelicula peli = manejadorPeliculas.buscarPorNombre(nombre);
        return peli;
    }
    
    @Override
    public String actoresToText(Pelicula p) {
        Lista<Comparable> lista = p.getListaActores();
        INodo<Comparable> aux = lista.getPrimero();
        String str = "";
        while (aux != null) {
            str = str + manejadorActores.buscarPorCodigo(aux.getEtiqueta()).getNombre() + ",";
            aux = aux.getSiguiente();
        }
        return str;
    }
    
    @Override
    public String productoresToText(Pelicula p) {
        Lista<Comparable> lista = p.getListaProductores();
        INodo<Comparable> aux = lista.getPrimero();
        String str = "";
        while (aux != null) {
            try {
                str = str + manejadorProductores.buscarPorCodigo(aux.getEtiqueta()).getNombre() + ",";
            } catch (Exception e) {
                System.out.println("Error en buscar los productores en la pelicula");
            }
            aux = aux.getSiguiente();
        }
        return str;
    }
    
    @Override
    public String directoresToText(Pelicula p) {
        Lista<Comparable> lista = p.getListaDirectores();
        INodo<Comparable> aux = lista.getPrimero();
        String str = "";
        while (aux != null) {
            str = str + manejadorDirectores.buscarPorCodigo(aux.getEtiqueta()).getNombre() + ",";
            aux = aux.getSiguiente();
        }
        return str;
    }
}
