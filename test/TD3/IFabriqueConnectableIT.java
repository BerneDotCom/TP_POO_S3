/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD3;

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
public class IFabriqueConnectableIT {
    
    public IFabriqueConnectableIT() {
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
     * Test of creer method, of class IFabriqueConnectable.
     */
    @Test
    public void testCreer() {
        System.out.println("creer");
        String objetACreer = "";
        IFabriqueConnectable instance = new IFabriqueConnectableImpl();
        Connectable expResult = null;
        Connectable result = instance.creer(objetACreer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IFabriqueConnectableImpl implements IFabriqueConnectable {

        public Connectable creer(String objetACreer) {
            return null;
        }
    }
    
}
