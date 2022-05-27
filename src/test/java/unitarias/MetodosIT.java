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
public class MetodosIT {
    
    public MetodosIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @Test
    public void testClasificacion() {
        System.out.println("clasificacion");
        String tipo = "niños";
        VideoJuego instance = new VideoJuego();
        String expResult = "+3";
        String result = instance.clasificacion(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equalsIgnoreCase(expResult)) {
            
             fail("The test case is a prototype.");
        }
       
    }

    /**
     * Test of precioEnvio method, of class Metodos.
     */
    @Test
    public void testPrecioEnvio() {
        System.out.println("precioEnvio");
        double precio = 300.0;
        VideoJuego instance = new VideoJuego();
        double expResult = 399.0;
        double result = instance.precioEnvio(precio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result!=expResult) {
            fail("The test case is a prototype.");
        }
        
    }
    
}
