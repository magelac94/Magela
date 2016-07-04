/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IManejadorPeliculas;
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
public class AdaptadorInterfazManejadoresIT {
    
    public AdaptadorInterfazManejadoresIT() {
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
     * Test of cargarDatos method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testCargarDatos() {
        System.out.println("cargarDatos");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        instance.cargarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeliculas method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testGetPeliculas() {
        System.out.println("getPeliculas");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.getPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManejador method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testGetManejador() {
        System.out.println("getManejador");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        IManejadorPeliculas expResult = null;
        IManejadorPeliculas result = instance.getManejador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActores method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testGetActores() {
        System.out.println("getActores");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Actor> expResult = null;
        Lista<Actor> result = instance.getActores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActorPelicula method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testGetActorPelicula() {
        System.out.println("getActorPelicula");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<ActorPelicula> expResult = null;
        Lista<ActorPelicula> result = instance.getActorPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombre method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorNombre() {
        System.out.println("buscarPorNombre");
        String nombre = "";
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombreLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorNombreLista() {
        System.out.println("buscarPorNombreLista");
        String nombre = "";
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorNombreLista(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorFechaLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorFechaLista_short_Lista() {
        System.out.println("buscarPorFechaLista");
        short fecha = 0;
        Lista<Pelicula> lista = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorFechaLista(fecha, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorFechaLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorFechaLista_short() {
        System.out.println("buscarPorFechaLista");
        short fecha = 0;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorFechaLista(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorRankingLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorRankingLista() {
        System.out.println("buscarPorRankingLista");
        float ranking = 0.0F;
        Lista<Pelicula> lista = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorRankingLista(ranking, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorGeneroLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorGeneroLista() {
        System.out.println("buscarPorGeneroLista");
        String unGenero = "";
        Lista<Pelicula> lista = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorGeneroLista(unGenero, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaMultiple method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscaMultiple() {
        System.out.println("buscaMultiple");
        String nombreBuscar = "";
        short fechaShort2 = 0;
        float rankingB2 = 0.0F;
        String generoBuscar = "";
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscaMultiple(nombreBuscar, fechaShort2, rankingB2, generoBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorActorLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorActorLista() {
        System.out.println("buscarPorActorLista");
        String nombreActor = "";
        Lista<Pelicula> listaDondeBuscar = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorActorLista(nombreActor, listaDondeBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorProductorLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorProductorLista() {
        System.out.println("buscarPorProductorLista");
        String nombreProductor = "";
        Lista<Pelicula> lista = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorProductorLista(nombreProductor, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorDirectorLista method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testBuscarPorDirectorLista() {
        System.out.println("buscarPorDirectorLista");
        String nombreDirector = "";
        Lista<Pelicula> lista = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.buscarPorDirectorLista(nombreDirector, lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPeliculas method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testObtenerPeliculas() {
        System.out.println("obtenerPeliculas");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Pelicula> expResult = null;
        Lista<Pelicula> result = instance.obtenerPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerActores method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testObtenerActores() {
        System.out.println("obtenerActores");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Lista<Persona> expResult = null;
        Lista<Persona> result = instance.obtenerActores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPeliculasActores method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testObtenerPeliculasActores() {
        System.out.println("obtenerPeliculasActores");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        instance.obtenerPeliculasActores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPeliculasProductores method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testObtenerPeliculasProductores() {
        System.out.println("obtenerPeliculasProductores");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        instance.obtenerPeliculasProductores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPeliculasDirectores method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testObtenerPeliculasDirectores() {
        System.out.println("obtenerPeliculasDirectores");
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        instance.obtenerPeliculasDirectores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelicula method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testGetPelicula() {
        System.out.println("getPelicula");
        String nombre = "";
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        Pelicula expResult = null;
        Pelicula result = instance.getPelicula(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actoresToText method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testActoresToText() {
        System.out.println("actoresToText");
        Pelicula p = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        String expResult = "";
        String result = instance.actoresToText(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productoresToText method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testProductoresToText() {
        System.out.println("productoresToText");
        Pelicula p = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        String expResult = "";
        String result = instance.productoresToText(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of directoresToText method, of class AdaptadorInterfazManejadores.
     */
    @Test
    public void testDirectoresToText() {
        System.out.println("directoresToText");
        Pelicula p = null;
        AdaptadorInterfazManejadores instance = new AdaptadorInterfazManejadores();
        String expResult = "";
        String result = instance.directoresToText(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
