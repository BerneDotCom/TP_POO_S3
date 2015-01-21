/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Val
 */
public class TarifFactoryIT {
    
    public TarifFactoryIT() {
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
     * Test of calculerTarif method, of class TarifFactory.
     */
    @Test
    public void testCalculerTarif() {
        System.out.println("calculerTarif");
        Conteneur conteneur = null;
        TarifFactory instance = new TarifFactoryImpl();
        double expResult = 0.0;
        double result = instance.calculerTarif(conteneur);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TarifFactoryImpl implements TarifFactory {

        public double calculerTarif(Conteneur conteneur) {
            return 0.0;
        }
    }
    
}
