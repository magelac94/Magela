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
public class ManejadorPersonasIT {
    
    public ManejadorPersonasIT() {
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
     * Test of getLista method, of class ManejadorPersonas.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        ManejadorPersonas instance = new ManejadorPersonas();
        Lista<Persona> expResult = null;
        Lista<Persona> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarPersona method, of class ManejadorPersonas.
     */
    @Test
    public void testInsertarPersona() {
        System.out.println("insertarPersona");
        Persona unaPersona = null;
        ManejadorPersonas instance = new ManejadorPersonas();
        instance.insertarPersona(unaPersona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorCodigo method, of class ManejadorPersonas.
     */
    @Test
    public void testBuscarPorCodigo() {
        System.out.println("buscarPorCodigo");
        Comparable codigo = null;
        ManejadorPersonas instance = new ManejadorPersonas();
        Persona expResult = null;
        Persona result = instance.buscarPorCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombre method, of class ManejadorPersonas.
     */
    @Test
    public void testBuscarPorNombre() {
        System.out.println("buscarPorNombre");
        String nombre = "";
        ManejadorPersonas instance = new ManejadorPersonas();
        Persona expResult = null;
        Persona result = instance.buscarPorNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombreLista method, of class ManejadorPersonas.
     */
    @Test
    public void testBuscarPorNombreLista_String() {
        System.out.println("buscarPorNombreLista");
        String nombreBuscar = "";
        ManejadorPersonas instance = new ManejadorPersonas();
        Lista<Persona> expResult = null;
        Lista<Persona> result = instance.buscarPorNombreLista(nombreBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorNombreLista method, of class ManejadorPersonas.
     */
    @Test
    public void testBuscarPorNombreLista_String_Lista() {
        System.out.println("buscarPorNombreLista");
        String nombreBuscar = "";
        Lista<Persona> listaDondeBuscar = null;
        ManejadorPersonas instance = new ManejadorPersonas();
        Lista<Persona> expResult = null;
        Lista<Persona> result = instance.buscarPorNombreLista(nombreBuscar, listaDondeBuscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadPersonas method, of class ManejadorPersonas.
     */
    @Test
    public void testCantidadPersonas() {
        System.out.println("cantidadPersonas");
        ManejadorPersonas instance = new ManejadorPersonas();
        int expResult = 0;
        int result = instance.cantidadPersonas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
