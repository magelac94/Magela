/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

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
public class TArbolBBIT {
    
    public TArbolBBIT() {
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
     * Test of insertar method, of class TArbolBB.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TArbolBB.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TArbolBB.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TArbolBB.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TArbolBB.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        instance.eliminar(unaEtiqueta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TArbolBB.
     */
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altura method, of class TArbolBB.
     */
    @Test
    public void testAltura() {
        System.out.println("altura");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 2;
        int result = instance.altura();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tamanio method, of class TArbolBB.
     */
    @Test
    public void testTamanio() {
        System.out.println("tamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 3;
        int result = instance.tamanio();
        assertEquals(expResult, result);

    }

    /**
     * Test of niveles method, of class TArbolBB.
     */
    @Test
    public void testNiveles() {
        System.out.println("niveles");
        Comparable et = 2;
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 1;
        int result = instance.niveles(et);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of cantidadHojas method, of class TArbolBB.
     */
    @Test
    public void testCantidadHojas() {
        System.out.println("cantidadHojas");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 1;
        int result = instance.cantidadHojas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of listarHojas method, of class TArbolBB.
     */
    @Test
    public void testListarHojas() {
        System.out.println("listarHojas");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(3, null));
        String expResult = "13";
        String result = instance.listarHojas();
        assertEquals(expResult, result);
    }

    /**
     * Test of minimo method, of class TArbolBB.
     */
    @Test
    public void testMinimo() {
        System.out.println("minimo");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(3, null));
        Comparable expResult = instance.buscar(1).getEtiqueta();
        Comparable result = instance.minimo().getEtiqueta();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of maximo method, of class TArbolBB.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(3, null));
        Comparable expResult = instance.buscar(3).getEtiqueta();
        Comparable result = instance.maximo().getEtiqueta();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lexicoAnterior method, of class TArbolBB.
     */
    @Test
    public void testLexicoAnterior() {
        System.out.println("lexicoAnterior");
        Comparable unaClave = 3;
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        Comparable expResult = 2;
        Comparable result = instance.lexicoAnterior(unaClave).getEtiqueta();
        assertEquals(expResult, result);
        
    }
    
}
