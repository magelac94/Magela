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
public class PeliculaIT {
    
    public PeliculaIT() {
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
     * Test of toText method, of class Pelicula.
     */
    @Test
    public void testToText() {
        System.out.println("toText");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.toText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Pelicula.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pelicula instance = null;
        Comparable expResult = null;
        Comparable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pelicula.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pelicula instance = null;
        short expResult = 0;
        short result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRanking method, of class Pelicula.
     */
    @Test
    public void testSetRanking() {
        System.out.println("setRanking");
        float ranking = 0.0F;
        Pelicula instance = null;
        instance.setRanking(ranking);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Pelicula.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Pelicula.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Pelicula instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Pelicula.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRanking method, of class Pelicula.
     */
    @Test
    public void testGetRanking() {
        System.out.println("getRanking");
        Pelicula instance = null;
        float expResult = 0.0F;
        float result = instance.getRanking();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenero method, of class Pelicula.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Pelicula.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Pelicula instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarActor method, of class Pelicula.
     */
    @Test
    public void testAgregarActor() {
        System.out.println("agregarActor");
        Comparable idActor = null;
        Pelicula instance = null;
        instance.agregarActor(idActor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProductor method, of class Pelicula.
     */
    @Test
    public void testAgregarProductor() {
        System.out.println("agregarProductor");
        Comparable idProductor = null;
        Pelicula instance = null;
        instance.agregarProductor(idProductor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDirector method, of class Pelicula.
     */
    @Test
    public void testAgregarDirector() {
        System.out.println("agregarDirector");
        Comparable idDirector = null;
        Pelicula instance = null;
        instance.agregarDirector(idDirector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaActores method, of class Pelicula.
     */
    @Test
    public void testGetListaActores() {
        System.out.println("getListaActores");
        Pelicula instance = null;
        Lista<Comparable> expResult = null;
        Lista<Comparable> result = instance.getListaActores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaProductores method, of class Pelicula.
     */
    @Test
    public void testGetListaProductores() {
        System.out.println("getListaProductores");
        Pelicula instance = null;
        Lista<Comparable> expResult = null;
        Lista<Comparable> result = instance.getListaProductores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDirectores method, of class Pelicula.
     */
    @Test
    public void testGetListaDirectores() {
        System.out.println("getListaDirectores");
        Pelicula instance = null;
        Lista<Comparable> expResult = null;
        Lista<Comparable> result = instance.getListaDirectores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeActor method, of class Pelicula.
     */
    @Test
    public void testExisteActor() {
        System.out.println("existeActor");
        Comparable idActor = null;
        Pelicula instance = null;
        boolean expResult = false;
        boolean result = instance.existeActor(idActor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeProductor method, of class Pelicula.
     */
    @Test
    public void testExisteProductor() {
        System.out.println("existeProductor");
        Comparable idProductor = null;
        Pelicula instance = null;
        boolean expResult = false;
        boolean result = instance.existeProductor(idProductor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeDirector method, of class Pelicula.
     */
    @Test
    public void testExisteDirector() {
        System.out.println("existeDirector");
        Comparable idDirectores = null;
        Pelicula instance = null;
        boolean expResult = false;
        boolean result = instance.existeDirector(idDirectores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
