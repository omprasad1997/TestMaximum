package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnTrue(){
        TestMaximum userString = new TestMaximum();
        String result = userString.findMaximum( "Apple","Peach","Banana");
        boolean max = (result.equals("Peach")) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenMaxString_NotAtSecondPosition_ShouldReturnFalse(){
        TestMaximum userString = new TestMaximum();
        String result = userString.findMaximum("Apple","Banana","Peach");
        boolean max = (result.equals("Banana")) ? true : false;
        Assertions.assertFalse(max);
    }
}
