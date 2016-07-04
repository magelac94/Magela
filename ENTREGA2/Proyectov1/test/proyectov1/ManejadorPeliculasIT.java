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
     * Test of listarPeliculas method, of class ManejadorPeliculas.
     */
    @Test
    public void testListarPeliculas() {
        System.out.println("listarPeliculas");
        ManejadorPeliculas instance = new ManejadorPeliculas();
        String expResult = "";
        String result = instance.listarPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarSeparador method, of class ManejadorPeliculas.
     */
    @Test
    public void testListarSeparador() {
        System.out.println("listarSeparador");
        String separador = "";
        ManejadorPeliculas instance = new ManejadorPeliculas();
        String expResult = "";
        String result = instance.listarSeparador(separador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarOrdenadoPorNombre method, of class ManejadorPeliculas.
     */
    @Test
    public void testListarOrdenadoPorNombre() {
        System.out.println("listarOrdenadoPorNombre");
        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.listarOrdenadoPorNombre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarOrdenadoPorDescripcion method, of class ManejadorPeliculas.
     */
    @Test
    public void testListarOrdenadoPorDescripcion() {
        System.out.println("listarOrdenadoPorDescripcion");
        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.listarOrdenadoPorDescripcion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarOrdenadoPorRanking method, of class ManejadorPeliculas.
     */
    @Test
    public void testListarOrdenadoPorRanking() {
        System.out.println("listarOrdenadoPorRanking");
        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.listarOrdenadoPorRanking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarOrdenadoPorFecha method, of class ManejadorPeliculas.
     */
    @Test
    public void testListarOrdenadoPorFecha() {
        System.out.println("listarOrdenadoPorFecha");
        ManejadorPeliculas instance = new ManejadorPeliculas();
        instance.listarOrdenadoPorFecha();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorCodigo method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorCodigo() {
        System.out.println("buscarPorCodigo");
        Comparable codigo = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorDescripcion method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorDescripcion() {
        System.out.println("buscarPorDescripcion");
        String descripcion = "";
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorDescripcion(descripcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorRanking method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorRanking() {
        System.out.println("buscarPorRanking");
        String ranking = "";
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorRanking(ranking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorFecha method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorFecha() {
        System.out.println("buscarPorFecha");
        short fecha = 0;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorFecha(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombre method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorNombre() {
        System.out.println("buscarPorNombre");
        String nombre = "";
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombreLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorNombreLista_String() {
        System.out.println("buscarPorNombreLista");
        String nombreBuscar = "";
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorNombreLista(nombreBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombreLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorNombreLista_String_Lista() {
        System.out.println("buscarPorNombreLista");
        String nombreBuscar = "";
        Lista<Pelicula> listaDondeBuscar = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorNombreLista(nombreBuscar, listaDondeBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorGeneroLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorGeneroLista() {
        System.out.println("buscarPorGeneroLista");
        String nombreGenero = "";
        Lista<Pelicula> listaDondeBuscar = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorGeneroLista(nombreGenero, listaDondeBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorFechaLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorFechaLista_short_Lista() {
        System.out.println("buscarPorFechaLista");
        short fechaBuscar = 0;
        Lista<Pelicula> listaDondeBuscar = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorFechaLista(fechaBuscar, listaDondeBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorFechaLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorFechaLista_short() {
        System.out.println("buscarPorFechaLista");
        short fechaBuscar = 0;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorFechaLista(fechaBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorRankingLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorRankingLista() {
        System.out.println("buscarPorRankingLista");
        float rankingBuscar = 0.0F;
        Lista<Pelicula> listaDondeBuscar = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorRankingLista(rankingBuscar, listaDondeBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of cantidadPeliculas method, of class ManejadorPeliculas.
     */
    @Test
    public void testCantidadPeliculas() {
        System.out.println("cantidadPeliculas");
        ManejadorPeliculas instance = new ManejadorPeliculas();
        int expResult = 0;
        int result = instance.cantidadPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorActorLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorActorLista() {
        System.out.println("buscarPorActorLista");
        Comparable idActor = null;
        Lista<Pelicula> lista = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorActorLista(idActor, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorProductorLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorProductorLista() {
        System.out.println("buscarPorProductorLista");
        String nombreProductor = "";
        Lista<Pelicula> lista = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorProductorLista(nombreProductor, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorDirectorLista method, of class ManejadorPeliculas.
     */
    @Test
    public void testBuscarPorDirectorLista() {
        System.out.println("buscarPorDirectorLista");
        String nombreDirector = "";
        Lista<Pelicula> lista = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorDirectorLista(nombreDirector, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peliculasQueContieneActor method, of class ManejadorPeliculas.
     */
    @Test
    public void testPeliculasQueContieneActor() {
        System.out.println("peliculasQueContieneActor");
        Comparable unActor = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.peliculasQueContieneActor(unActor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peliculasQueContieneProductor method, of class
     * ManejadorPeliculas.
     */
    @Test
    public void testPeliculasQueContieneProductor() {
        System.out.println("peliculasQueContieneProductor");
        Comparable unProductor = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.peliculasQueContieneProductor(unProductor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peliculasQueContieneDirector method, of class ManejadorPeliculas.
     */
    @Test
    public void testPeliculasQueContieneDirector() {
        System.out.println("peliculasQueContieneDirector");
        Comparable unDirector = null;
        ManejadorPeliculas instance = new ManejadorPeliculas();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.peliculasQueContieneDirector(unDirector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
