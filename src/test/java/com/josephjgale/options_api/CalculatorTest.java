package com.josephjgale.options_api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Calendar;

public class CalculatorTest {
    //Add test decorator
    @Test
    public void add_test(){
        //Add the object of the class you want to test
        Calculator calculator = new Calculator();
        //Use assertEquals to test an output against a function
        Assert.assertEquals(1,calculator.add(0,1));
    }

    @Test
    public void mock_test1(){
        Calendar mockCalendar = Mockito.mock(Calendar.class);
    }
}
