/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johan Herrera
 */
public class ListaDobleTest {
    
    public ListaDobleTest() {
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
     * Test of getCabeza method, of class ListaDoble.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaDoble instance = new ListaDoble();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaDoble.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Nodo cabeza = null;
        ListaDoble instance = new ListaDoble();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ListaDoble.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListaDoble instance = new ListaDoble();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ListaDoble.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaDoble instance = new ListaDoble();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVacio method, of class ListaDoble.
     */
    @Test
    public void testEstaVacio() {
        System.out.println("estaVacio");
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.estaVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ListaDoble.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaDoble instance = new ListaDoble();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class ListaDoble.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        int edad = 0;
        String nombre = "";
        String seleccion = "";
        String posicion = "";
        boolean convocado = false;
        String marca = "";
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.agregar(edad, nombre, seleccion, posicion, convocado, marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarAlInicio method, of class ListaDoble.
     */
    @Test
    public void testAgregarAlInicio() {
        System.out.println("agregarAlInicio");
        int edad = 0;
        String nombre = "";
        String seleccion = "";
        String posicion = "";
        boolean convocado = false;
        String marca = "";
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.agregarAlInicio(edad, nombre, seleccion, posicion, convocado, marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPorEdad method, of class ListaDoble.
     */
    @Test
    public void testAgregarPorEdad() {
        System.out.println("agregarPorEdad");
        int edad = 0;
        String nombre = "";
        String seleccion = "";
        String posicion = "";
        boolean convocado = false;
        ListaDoble instance = new ListaDoble();
        instance.agregarPorEdad(edad, nombre, seleccion, posicion, convocado);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPorPosicion method, of class ListaDoble.
     */
    @Test
    public void testAgregarPorPosicion() {
        System.out.println("agregarPorPosicion");
        int edad = 0;
        String nombre = "";
        String seleccion = "";
        String posicion = "";
        boolean convocado = false;
        String marca = "";
        ListaDoble instance = new ListaDoble();
        instance.agregarPorPosicion(edad, nombre, seleccion, posicion, convocado, marca);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirAlineacion method, of class ListaDoble.
     */
    @Test
    public void testImprimirAlineacion() {
        System.out.println("imprimirAlineacion");
        int portero = 0;
        int defensa = 0;
        int medio = 0;
        int delantero = 0;
        ListaDoble instance = new ListaDoble();
        String expResult = "";
        String result = instance.imprimirAlineacion(portero, defensa, medio, delantero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaChileTitulares method, of class ListaDoble.
     */
    @Test
    public void testListaChileTitulares() {
        System.out.println("listaChileTitulares");
        ListaDoble lista = null;
        ListaDoble instance = new ListaDoble();
        ListaDoble expResult = null;
        ListaDoble result = instance.listaChileTitulares(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaChileConvocados method, of class ListaDoble.
     */
    @Test
    public void testListaChileConvocados() {
        System.out.println("listaChileConvocados");
        ListaDoble lista = null;
        ListaDoble instance = new ListaDoble();
        ListaDoble expResult = null;
        ListaDoble result = instance.listaChileConvocados(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaEspaña method, of class ListaDoble.
     */
    @Test
    public void testListaEspaña() {
        System.out.println("listaEspa\u00f1a");
        ListaDoble lista = null;
        ListaDoble instance = new ListaDoble();
        ListaDoble expResult = null;
        ListaDoble result = instance.listaEspaña(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ListaDoble.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String dato = "";
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.eliminar(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaDoble.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaDoble instance = new ListaDoble();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }   
}
