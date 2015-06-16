/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitThijs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thijs
 */
public class InfiniteLoopTest {
    
    public InfiniteLoopTest() {
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
     * Test of loop method, of class InfiniteLoop.
     */
        @Test
    public void testLoop() {
        System.out.println("loop");
        int one = 0;
        int expResult = 2;
        int result = InfiniteLoop.loop(one);
        assertEquals(expResult, result);
    }
    
    @Test
        (timeout = 1000)
        public void test() {
            int three = InfiniteLoop.loop(1);
            assertEquals(1, three, 0);
        }
    }

