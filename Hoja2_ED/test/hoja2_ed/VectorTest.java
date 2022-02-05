/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hoja2_ed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsken
 */
public class VectorTest {
    
    public VectorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Evaluate method, of class Vector.
     */
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate");
        String dato = "12+";
        Vector instance = new Vector();
        int expResult = 3;
        int result = instance.Evaluate(dato);
        assertEquals(expResult, result);
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of push method, of class Vector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object value = null;
        Vector instance = new Vector();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pull method, of class Vector.
     */
    @Test
    public void testPull() {
        System.out.println("pull");
        Vector instance = new Vector();
        Object expResult = null;
        Object result = instance.pull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    //hola

    /**
     * Test of peek method, of class Vector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Vector instance = new Vector();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class Vector.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        Vector instance = new Vector();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Vector.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Vector instance = new Vector();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
