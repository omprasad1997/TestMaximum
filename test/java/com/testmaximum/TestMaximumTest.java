package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        Float result = userNumbers.findMaximum( 2.1f,1.1f,3.1f);
        boolean max = (result==3.1f) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenMaxNumber_NotAtThirdPosition_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        Float result = userNumbers.findMaximum(3.1f,2.1f,1.1f);
        boolean max = (result==2.1f) ? true : false;
        Assertions.assertFalse(max);
    }
}
