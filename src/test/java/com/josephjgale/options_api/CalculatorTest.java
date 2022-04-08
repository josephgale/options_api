package com.josephjgale.options_api;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void add_test(){
        Calculator calculator = new Calculator();
        int result = calculator.add(0,1);
        Assert.assertEquals(1,result);
    }
}
