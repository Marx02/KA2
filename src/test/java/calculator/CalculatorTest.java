/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author caspe
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int n1 = 2;
        int n2 = 2;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.add(n1, n2);
        assertEquals(expResult, result);

    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int n1 = 11;
        int n2 = 3;
        Calculator instance = new Calculator();
        int expResult = 8;
        int result = instance.sub(n1, n2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.mul(n1, n2);
        assertEquals(expResult, result);

    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int n1 = 10;
        int n2 = 2;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.div(n1, n2);
        assertEquals(expResult, result);

    }
    
}

