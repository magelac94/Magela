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
public class NodoIT {
    
    public NodoIT() {
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
     * Test of getDato method, of class Nodo.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        Nodo instance = null;
        Object expResult = null;
        Object result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato method, of class Nodo.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        Object dato = null;
        Nodo instance = null;
        instance.setDato(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtiqueta method, of class Nodo.
     */
    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        Nodo instance = null;
        Comparable expResult = null;
        Comparable result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiguiente method, of class Nodo.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        Nodo instance = null;
        instance.setSiguiente(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguiente method, of class Nodo.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        Nodo instance = null;
        INodo expResult = null;
        INodo result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Nodo.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        Nodo instance = null;
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirEtiqueta method, of class Nodo.
     */
    @Test
    public void testImprimirEtiqueta() {
        System.out.println("imprimirEtiqueta");
        Nodo instance = null;
        instance.imprimirEtiqueta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clonar method, of class Nodo.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Nodo instance = null;
        INodo expResult = null;
        INodo result = instance.clonar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Nodo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Nodo instance = null;
        boolean expResult = false;
        boolean result = instance.equals(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Nodo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Comparable etiqueta = null;
        Nodo instance = null;
        int expResult = 0;
        int result = instance.compareTo(etiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
