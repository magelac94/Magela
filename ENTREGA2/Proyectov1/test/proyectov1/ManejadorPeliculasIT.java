/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magela
 */
public class ManejadorPeliculasIT {

    public ManejadorPeliculasIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insertarPelicula method, of class ManejadorPeliculas.
     */
    @Test
    public void testInsertarPelicula() {
        System.out.println("insertarPelicula");
        Comparable id = 9;
        String nombre = " El hombre ara;a";
        short anio = 2004;
        float ranking = 4;
        String genero = "Aventura";
        String descripcion = "bla bla bla bla";

        Pelicula unaPelicula = new Pelicula(id, nombre, anio, ranking, genero, descripcion);

        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(unaPelicula);

    }

    /**
     * Test of insertarPelicula method, of class ManejadorPeliculas.
     */
    @Test
    public void testInsertarPeliculaconNulos() {
        System.out.println("insertarPelicula con Nulos");
        Comparable id = 9;
        String nombre = " El hombre ara;a";
        short anio = 2004;
        float ranking = 4;
        String genero = "Aventura";
        String descripcion = "bla bla bla bla";

        Pelicula unaPelicula = new Pelicula(id, nombre, anio, ranking, null, null);

        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(unaPelicula);

    }

    /**
     * Test of buscaMultiple method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscaMultipleValida() {
        System.out.println("buscaMultiple");

        // CREO TRES PELICULAS Y AGREGO
        Comparable id1 = 1;
        short fecha1 = 2013;
        float ranking1 = 4.6F;

        Comparable id2 = 2;
        short fecha2 = 2014;
        float ranking2 = 4.7F;

        Comparable id3 = 3;
        short fecha3 = 2015;
        float ranking3 = 5.0F;

        Pelicula pelicula1 = new Pelicula(id1, "Uno", fecha1, ranking1,"descripcion1", "accion");
        Pelicula pelicula2 = new Pelicula(id2, "Dos", fecha2, ranking2,"descripcion2", "drama" );
        Pelicula pelicula3 = new Pelicula(id3, "Tres", fecha3, ranking3, "descripcion3", "comedia");

        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(pelicula1);
        instance.insertarPelicula(pelicula2);
        instance.insertarPelicula(pelicula3);

        //resultado esperado
        Lista<Pelicula> resultadoEsperado = new Lista();
        Nodo<Pelicula> nodo = new Nodo(pelicula1, id1);
        resultadoEsperado.insertar(nodo);

        // BUSQUEDA DE PELICULAS 
        String nombreBuscar = "Uno";
        short fechaShort2 = 2013;
        float rankingBuscar = 0.0F;
        String generoBuscar = "accion";

        //   Lista<Pelicula> expResult = resultadoEsperado;
       // Lista<Pelicula> 
       Comparable expResult = resultadoEsperado.getPrimero().getEtiqueta();

      //  Lista<Pelicula> 
      Comparable result = instance.buscaMultiple(nombreBuscar, fechaShort2, rankingBuscar, generoBuscar).getPrimero().getEtiqueta();
        
        assertEquals(expResult, result);

    }
    
     /**
     * Test of buscaMultiple method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscaMultipleVacia() {
        System.out.println("buscaMultiple");

        // CREO TRES PELICULAS Y AGREGO
        Comparable id1 = 1;
        short fecha1 = 2013;
        float ranking1 = 4.6F;

        Comparable id2 = 2;
        short fecha2 = 2014;
        float ranking2 = 4.7F;

        Comparable id3 = 3;
        short fecha3 = 2015;
        float ranking3 = 5.0F;

        Pelicula pelicula1 = new Pelicula(id1, "Uno", fecha1, ranking1,"descripcion1", "accion");
        Pelicula pelicula2 = new Pelicula(id2, "Dos", fecha2, ranking2,"descripcion2", "drama" );
        Pelicula pelicula3 = new Pelicula(id3, "Tres", fecha3, ranking3, "descripcion3", "comedia");

        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(pelicula1);
        instance.insertarPelicula(pelicula2);
        instance.insertarPelicula(pelicula3);

        // BUSQUEDA DE PELICULAS 
        String nombreBuscar = "Uno";
        short fechaShort2 = 2013;
        float rankingBuscar = 0.0F;
        String generoBuscar = "drama";

        Comparable result = instance.buscaMultiple(nombreBuscar, fechaShort2, rankingBuscar, generoBuscar).cantElementos();
        
       assertEquals(0, result);

    }

    /**
     * Test of buscaMultiple method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscaMultipleDoble() {
        System.out.println("buscaMultiple Doble");

        // CREO TRES PELICULAS Y AGREGO
        Comparable id1 = 1;
        short fecha1 = 2013;
        float ranking1 = 4.6F;

        Comparable id2 = 2;
        short fecha2 = 2014;
        float ranking2 = 4.7F;

        Comparable id3 = 3;
        short fecha3 = 2015;
        float ranking3 = 5.0F;

        Pelicula pelicula1 = new Pelicula(id1, "Uno", fecha1, ranking1,"descripcion1", "accion");
        Pelicula pelicula2 = new Pelicula(id2, "Dos", fecha2, ranking2,"descripcion2", "accion" );
        Pelicula pelicula3 = new Pelicula(id3, "Tres", fecha3, ranking3, "descripcion3", "comedia");

        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(pelicula1);
        instance.insertarPelicula(pelicula2);
        instance.insertarPelicula(pelicula3);

        // BUSQUEDA DE PELICULAS 
        String nombreBuscar = "";
        short fechaShort2 = 0;
        float rankingBuscar = 0.0F;
        String generoBuscar = "accion";

       Comparable expResult = 2;

      Comparable result = instance.buscaMultiple(nombreBuscar, fechaShort2, rankingBuscar, generoBuscar).cantElementos();
        
        assertEquals(expResult, result);

    }
 /**
     * Test of buscaMultiple method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscaMultipleSoloFecha() {
        System.out.println("buscaMultiple Doble solo FECHA");

        // CREO TRES PELICULAS Y AGREGO
        Comparable id1 = 1;
        short fecha1 = 2014;
        float ranking1 = 4.6F;

        Comparable id2 = 2;
        short fecha2 = 2014;
        float ranking2 = 4.7F;

        Comparable id3 = 3;
        short fecha3 = 2019;
        float ranking3 = 5.0F;

        Pelicula pelicula1 = new Pelicula(id1, "Uno", fecha1, ranking1,"descripcion1", "accion");
        Pelicula pelicula2 = new Pelicula(id2, "Dos", fecha2, ranking2,"descripcion2", "accion" );
        Pelicula pelicula3 = new Pelicula(id3, "Tres", fecha3, ranking3, "descripcion3", "comedia");

        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(pelicula1);
        instance.insertarPelicula(pelicula2);
        instance.insertarPelicula(pelicula3);

        // BUSQUEDA DE PELICULAS 
        String nombreBuscar = "";
        short fechaShort2 = 2014;
        float rankingBuscar = 0.0F;
        String generoBuscar = "";

       Comparable expResult = 2;

      Comparable result = instance.buscaMultiple(nombreBuscar, fechaShort2, rankingBuscar, generoBuscar).cantElementos();
        
        assertEquals(expResult, result);

    }

    

    /**
     * Test of buscaMultipleConActor method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscaMultipleConActor() {
        System.out.println("buscaMultipleConActor");
        
        //Se crea y agrega una pelicula
        Comparable id1 = 1;
        short fecha1 = 2013;
        float ranking1 = 4.6F;
        Pelicula pelicula1 = new Pelicula(id1, "Uno", fecha1, ranking1,"descripcion1", "accion");
        
        // Se crean 3 actores y se asocian a esa pelicula
        Comparable idActor1 = 1;
        String nombreActor1 = "Jhon";
        String fechaNacimiento1 = "21/12/1990";
        String lugarNacimiento1 = "Alaska";
        String biografia1 = "bla bla bla";
        Persona unaPersona1 = new Actor(idActor1,nombreActor1,fechaNacimiento1,lugarNacimiento1,biografia1);
        
        Comparable idActor2 = 2;
        String nombreActor2 = "Maria";
        String fechaNacimiento2 = "21/2/1990";
        String lugarNacimiento2 = "Marruecos";
        String biografia2 = "bla bla bla";
        Persona unaPersona2 = new Actor(idActor2,nombreActor2,fechaNacimiento2,lugarNacimiento2,biografia2);
        
        Comparable idActor3 = 3;
        String nombreActor3 = "Jose";
        String fechaNacimiento3 = "1/12/1990";
        String lugarNacimiento3 = "Brazil";
        String biografia3 = "bla bla bla";
        Persona unaPersona3 = new Actor(idActor3,nombreActor3,fechaNacimiento3,lugarNacimiento3,biografia3);
        
        pelicula1.agregarActor(unaPersona1.getId());
        pelicula1.agregarActor(unaPersona2.getId());
        pelicula1.agregarActor(unaPersona3.getId());
        
        // Se inserta esa pelicula
        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(pelicula1);
              
        Comparable idActor = 3;
        Comparable expResult = 1;
        
        short i = 0;
        Comparable result = instance.buscaMultipleConActor("",i, 0.0F, "", idActor).cantElementos();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of buscaMultipleConActor method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscaMultipleConActorNull() {
        System.out.println("buscaMultipleConActor");
        
        //Se crea y agrega una pelicula
        Comparable id1 = 1;
        short fecha1 = 2013;
        float ranking1 = 4.6F;
        Pelicula pelicula1 = new Pelicula(id1, "Uno", fecha1, ranking1,"descripcion1", "accion");
        
        // Se crean 3 actores y se asocian a esa pelicula
        Comparable idActor1 = 1;
        String nombreActor1 = "Jhon";
        String fechaNacimiento1 = "21/12/1990";
        String lugarNacimiento1 = "Alaska";
        String biografia1 = "bla bla bla";
        Persona unaPersona1 = new Actor(idActor1,nombreActor1,fechaNacimiento1,lugarNacimiento1,biografia1);
        
        Comparable idActor2 = 2;
        String nombreActor2 = "Maria";
        String fechaNacimiento2 = "21/2/1990";
        String lugarNacimiento2 = "Marruecos";
        String biografia2 = "bla bla bla";
        Persona unaPersona2 = new Actor(idActor2,nombreActor2,fechaNacimiento2,lugarNacimiento2,biografia2);
        
        Comparable idActor3 = 3;
        String nombreActor3 = "Jose";
        String fechaNacimiento3 = "1/12/1990";
        String lugarNacimiento3 = "Brazil";
        String biografia3 = "bla bla bla";
        Persona unaPersona3 = new Actor(idActor3,nombreActor3,fechaNacimiento3,lugarNacimiento3,biografia3);
        
        pelicula1.agregarActor(unaPersona1.getId());
        pelicula1.agregarActor(unaPersona2.getId());
        pelicula1.agregarActor(unaPersona3.getId());
        
        // Se inserta esa pelicula
        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.insertarPelicula(pelicula1);
              
        Comparable idActor = 6;
        Comparable expResult = 0;
        
        short i = 0;
        Comparable result = instance.buscaMultipleConActor("",i, 0.0F, "", idActor).cantElementos();
        assertEquals(expResult, result);
    }
    
    
        

}
