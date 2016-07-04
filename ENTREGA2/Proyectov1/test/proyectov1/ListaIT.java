/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.INodo;
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
public class ListaIT {
    
    public ListaIT() {
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
     * Test of insertar method, of class Lista.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Lista instance = new Lista();
        instance.insertar(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class Lista.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable clave = null;
        Lista instance = new Lista();
        INodo expResult = null;
        INodo result = instance.buscar(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Lista.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable clave = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.eliminar(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Lista.
     */
    @Test
    public void testImprimir_0args() {
        System.out.println("imprimir");
        Lista instance = new Lista();
        String expResult = "";
        String result = instance.imprimir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Lista.
     */
    @Test
    public void testImprimir_String() {
        System.out.println("imprimir");
        String separador = "";
        Lista instance = new Lista();
        String expResult = "";
        String result = instance.imprimir(separador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantElementos method, of class Lista.
     */
    @Test
    public void testCantElementos() {
        System.out.println("cantElementos");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.cantElementos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacia method, of class Lista.
     */
    @Test
    public void testEsVacia() {
        System.out.println("esVacia");
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.esVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimero method, of class Lista.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        Lista instance = new Lista();
        INodo expResult = null;
        INodo result = instance.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
