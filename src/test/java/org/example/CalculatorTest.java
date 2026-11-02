package org.example;


import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class CalculatorTest extends TestCase {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(1, 3));
    }

@Test
public void prodTest(){
    Calculator calculator = new Calculator();
        assertEquals(4, calculator.prod(2 , 2) );
}

@Test
    public void divide(){
    Calculator calculator = new Calculator();
    assertEquals(1.0, calculator.divide(2.0,2.0));
}

}