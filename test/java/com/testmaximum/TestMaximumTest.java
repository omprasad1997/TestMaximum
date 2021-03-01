package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnTrue(){
        TestMaximum userString = new TestMaximum();
        String result = userString.findMaximum( "Peach","Apple","Banana");
        boolean max = (result.equals("Peach")) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenMaxString_NotAtFirstPosition_ShouldReturnFalse(){
        TestMaximum userString = new TestMaximum();
        String result = userString.findMaximum("Apple","Peach","Banana");
        boolean max = (result.equals("Apple")) ? true : false;
        Assertions.assertFalse(max);
    }
}
