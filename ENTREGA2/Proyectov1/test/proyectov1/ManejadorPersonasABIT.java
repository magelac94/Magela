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
public class ManejadorPersonasABIT {
    
    public ManejadorPersonasABIT() {
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
     * Test of insertarPersona method, of class ManejadorPersonasAB.
     */
    @Test
    public void testInsertarPersonaActor() {
        System.out.println("insertarPersona Actor");
        Comparable idActor = 1;
        String nombreActor = "Jhon";
        String fechaNacimiento = "21/12/1990";
        String lugarNacimiento = "Alaska";
        String biografia = "bla bla bla";
        Persona unaPersona = new Actor(idActor,nombreActor,fechaNacimiento,lugarNacimiento,biografia);
        
        
        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        instance.insertarPersona(unaPersona);
       
    }
    
    /**
     * Test of buscarPorCodigo method, of class ManejadorPersonasAB.
     */
    @Test
    public void testBuscarPorCodigo() {
        System.out.println("buscarPorCodigo");

        System.out.println("insertarPersona Actor");
        Comparable idActor = 1;
        String nombreActor = "Jhon";
        String fechaNacimiento = "21/12/1990";
        String lugarNacimiento = "Alaska";
        String biografia = "bla bla bla";
        Persona unaPersona = new Actor(idActor, nombreActor, fechaNacimiento, lugarNacimiento, biografia);

        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        instance.insertarPersona(unaPersona);

        Comparable codigo = 1;

        Comparable expResult = unaPersona.getId();

        Comparable result = instance.buscarPorCodigo(codigo).getId();
        assertEquals(expResult, result);

    }
    
    /**
     * Test of buscarPorCodigo method, of class ManejadorPersonasAB.
     */
    @Test
    public void testBuscarPorCodigoNoExiste() {
        System.out.println("buscarPorCodigo");

        System.out.println("insertarPersona Actor");
        Comparable idActor = 1;
        String nombreActor = "Jhon";
        String fechaNacimiento = "21/12/1990";
        String lugarNacimiento = "Alaska";
        String biografia = "bla bla bla";
        Persona unaPersona = new Actor(idActor, nombreActor, fechaNacimiento, lugarNacimiento, biografia);

        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        instance.insertarPersona(unaPersona);

        Comparable codigo = 2;

        Persona expResult = null;

        Persona result = instance.buscarPorCodigo(codigo);
        assertEquals(expResult, result);

    }

    /**
     * Test of cantidadPersonas method, of class ManejadorPersonasAB.
     */
    @Test
    public void testCantidadPersonasActores() {
        
        System.out.println("cantidadPersonas");
        
        Comparable idActor = 1;
        String nombreActor = "Jhon";
        String fechaNacimiento = "21/12/1990";
        String lugarNacimiento = "Alaska";
        String biografia = "bla bla bla";
        Persona unaPersona = new Actor(idActor,nombreActor,fechaNacimiento,lugarNacimiento,biografia);
        
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
        
        
        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        instance.insertarPersona(unaPersona);
        instance.insertarPersona(unaPersona2);
        instance.insertarPersona(unaPersona3);
        
               
        
        //ManejadorPersonasAB instance = new ManejadorPersonasAB();
        int expResult = 3;
        int result = instance.cantidadPersonas();
        assertEquals(expResult, result);
        
    }

     /**
     * Test of cantidadPersonas method, of class ManejadorPersonasAB.
     */
    @Test
    public void testCantidadPersonasActoresNull() {
        
        System.out.println("cantidadPersonas"); 
        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        int expResult = 0;
        int result = instance.cantidadPersonas();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of eliminar method, of class ManejadorPersonasAB.
     */
    @Test
    public void testEliminarValido() {
       
        System.out.println("eliminar");
        
        Comparable idActor = 1;
        String nombreActor = "Jhon";
        String fechaNacimiento = "21/12/1990";
        String lugarNacimiento = "Alaska";
        String biografia = "bla bla bla";
        Persona unaPersona = new Actor(idActor,nombreActor,fechaNacimiento,lugarNacimiento,biografia);
        
        Comparable idActor2 = 2;
        String nombreActor2 = "Maria";
        String fechaNacimiento2 = "21/2/1990";
        String lugarNacimiento2 = "Marruecos";
        String biografia2 = "bla bla bla";
        Persona unaPersona2 = new Actor(idActor2,nombreActor2,fechaNacimiento2,lugarNacimiento2,biografia2);
        
        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        instance.insertarPersona(unaPersona);
        instance.insertarPersona(unaPersona2);

        instance.eliminar(unaPersona);
        
    }
    
    /**
     * Test of eliminar method, of class ManejadorPersonasAB.
     */
    @Test
    public void testEliminarEvaluarPostCondicion() {
       
        System.out.println("eliminar");
        
        Comparable idActor = 1;
        String nombreActor = "Jhon";
        String fechaNacimiento = "21/12/1990";
        String lugarNacimiento = "Alaska";
        String biografia = "bla bla bla";
        Persona unaPersona = new Actor(idActor,nombreActor,fechaNacimiento,lugarNacimiento,biografia);
        
        Comparable idActor2 = 2;
        String nombreActor2 = "Maria";
        String fechaNacimiento2 = "21/2/1990";
        String lugarNacimiento2 = "Marruecos";
        String biografia2 = "bla bla bla";
        Persona unaPersona2 = new Actor(idActor2,nombreActor2,fechaNacimiento2,lugarNacimiento2,biografia2);
        
        ManejadorPersonasAB instance = new ManejadorPersonasAB();
        instance.insertarPersona(unaPersona);
        instance.insertarPersona(unaPersona2);

        int expResult = instance.cantidadPersonas();
        
        instance.eliminar(unaPersona);
        
        expResult = expResult-1;
        
        int result = instance.cantidadPersonas();
        assertEquals(expResult, result);
        
    }
    
}
