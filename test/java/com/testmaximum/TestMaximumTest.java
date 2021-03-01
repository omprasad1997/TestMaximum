package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        String result = userNumbers.findMaximum( "Banana","Apple","Peach");
        boolean max = (result.equals("Banana")) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenMaxNumber_NotAtFirstPosition_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        String result = userNumbers.findMaximum("Apple","Banana","Peach");
        boolean max = (result.equals("Apple")) ? true : false;
        Assertions.assertFalse(max);
    }
}
