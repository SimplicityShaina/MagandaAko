package sampleproject_package.src.com.javatpoint.testcase;


import static org.junit.jupiter.api.Assertions.assertEquals;

import sampleproject_package.src.com.javatpoint.logic.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


public class TestLogic {

	Calculation calculation;

    @BeforeEach                                         
    void setUp() {
        calculation = new Calculation();
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    public void testMultiply() {
        assertEquals(20, Calculation.multiply(4, 5),"Regular multiplication should work");  
        System.out.println("Simple multiplication should work");
    }

    @RepeatedTest(5)                                    
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        assertEquals(0, Calculation.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, Calculation.multiply(5, 0), "Multiple with zero should be zero");
        System.out.println("Ensure correct handling of zero");
    }
}

