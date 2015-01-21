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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Val
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TD3.CafetiereIT.class, TD3.RadioIT.class, TD3.IFabriqueConnectableIT.class, TD3.FabriqueConnectableIT.class, TD3.ConnectableIT.class})
public class TD3ITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
