/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL1;

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
public class ConjuntoIT {
    
    public ConjuntoIT() {
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
     * Test of complemento method, of class Conjunto.
     */
    @Test
    public void testComplemento() {
        
        System.out.println("complemento");
        IConjunto conjuntoUniversal = null; // pasar conjunto de alumnos
        Conjunto instance = new Conjunto();
        IConjunto expResult = null;         // pasar conjunto con lo esperado
        IConjunto result = instance.complemento(conjuntoUniversal);
        assertEquals(expResult, result);    // resultado
        
    }

    /**
     * Test of insertar method, of class Conjunto.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Conjunto instance = new Conjunto();
        instance.insertar(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
