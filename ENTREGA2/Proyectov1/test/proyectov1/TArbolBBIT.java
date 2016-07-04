/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IElementoAB;
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
    public void testInsertar_IElementoAB() {
        System.out.println("insertar");
        IElementoAB unElemento = null;
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(unElemento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TArbolBB.
     */
    @Test
    public void testInsertar_IElementoAB_IntegerArr() {
        System.out.println("insertar");
        IElementoAB unElemento = null;
        Integer[] contador = null;
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(unElemento, contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
    @Test
    public void testBuscar_Comparable_IntegerArr() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        Integer[] contador = null;
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.buscar(unaEtiqueta, contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
    @Test
    public void testBuscar_Comparable() {
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
     * Test of obtenerAltura method, of class TArbolBB.
     */
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTamanio method, of class TArbolBB.
     */
    @Test
    public void testObtenerTamanio() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNivel method, of class TArbolBB.
     */
    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerNivel(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantidadHojas method, of class TArbolBB.
     */
    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarHojas method, of class TArbolBB.
     */
    @Test
    public void testListarHojas() {
        System.out.println("listarHojas");
        TArbolBB instance = new TArbolBB();
        instance.listarHojas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMinimo method, of class TArbolBB.
     */
    @Test
    public void testEncontrarMinimo() {
        System.out.println("encontrarMinimo");
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.encontrarMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMaximo method, of class TArbolBB.
     */
    @Test
    public void testEncontrarMaximo() {
        System.out.println("encontrarMaximo");
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.encontrarMaximo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lexicograficamenteAnterior method, of class TArbolBB.
     */
    @Test
    public void testLexicograficamenteAnterior() {
        System.out.println("lexicograficamenteAnterior");
        Comparable unaClave = null;
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.lexicograficamenteAnterior(unaClave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantNodosNivel method, of class TArbolBB.
     */
    @Test
    public void testObtenerCantNodosNivel() {
        System.out.println("obtenerCantNodosNivel");
        int nivel = 0;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerCantNodosNivel(nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esDeBusqueda method, of class TArbolBB.
     */
    @Test
    public void testEsDeBusqueda() {
        System.out.println("esDeBusqueda");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esDeBusqueda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class TArbolBB.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRaiz method, of class TArbolBB.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        IElementoAB raiz = null;
        TArbolBB instance = new TArbolBB();
        instance.setRaiz(raiz);
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
     * Test of sumarClavesNivel method, of class TArbolBB.
     */
    @Test
    public void testSumarClavesNivel() {
        System.out.println("sumarClavesNivel");
        int n = 0;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.sumarClavesNivel(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
