package com.aditya;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(new Calculator().add(1,1), 2);
    }
}