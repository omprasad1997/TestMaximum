package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest{

    @Test
    public void givenIntegerMaxNumber_WhenProper_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result =  userNumbers.findMaximum(3,2,1);
        boolean max = (result==3) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenIntegerMaxNumber_WhenNotProper_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result =  userNumbers.findMaximum(6,10,5);
        boolean max = (result==6) ? true : false;
        Assertions.assertFalse(max);
    }

    @Test
    public void givenFloatMaxNumber_WhenProper_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        Float result =  userNumbers.findMaximum( 3.1f,2.1f,1.1f);
        boolean max = (result==3.1f) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenFloatMaxNumber_WhenNotProper_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        Float result =  userNumbers.findMaximum(2.1f,3.1f,1.1f);
        boolean max = (result==2.1f) ? true : false;
        Assertions.assertFalse(max);
    }

    @Test
    public void givenMaxString_WhenProper_ShouldReturnTrue(){
        TestMaximum userString = new TestMaximum();
        String result =  userString.findMaximum( "Peach","Banana","Apple");
        boolean max = (result.equals("Peach")) ? true : false;
        Assertions.assertTrue(max);
    }
    @Test
    public void givenMaxString_WhenNotProper_ShouldReturnFalse(){
        TestMaximum userString = new TestMaximum();
        String result =  userString.findMaximum("Apple","Peach","Banana");
        boolean max = (result.equals("Apple")) ? true : false;
        Assertions.assertFalse(max);
    }
}
