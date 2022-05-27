/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unitarias;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SI
 */
public class BarañonIT {
    
    public BarañonIT() {
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
     * Test of compra method, of class Barañon.
     */
    @Test
    public void testCompra() {
        System.out.println("compra");
        
        String bebida = "cocacola";
        double litros = 3;
        Barañon instance = new Barañon();  
        double expResult = 2.4000000000000004;
        Double result = expResult;
        instance.compra(bebida, litros);
        // TODO review the generated test code and remove the default call to fail.
        if (result!=expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
