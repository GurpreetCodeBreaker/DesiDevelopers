/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesidevelopers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gurpreet Singh
 */
public class JavaDesiDevelopersTest {
    
    public JavaDesiDevelopersTest() {
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
     * Test of main method, of class JavaDesiDevelopers.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaDesiDevelopers.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringPower method, of class JavaDesiDevelopers.
     */
    @Test
    public void testStringPower() {
        System.out.println("stringPower");
        String s = "";
        int a = 0;
        String expResult = "";
        String result = JavaDesiDevelopers.stringPower(s, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String s = "";
        int a = 0;
        String expResult = "";
        String result = JavaDesiDevelopers.stringPower(s, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
