package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result = userNumbers.findMaximum(2,1,3);
        boolean max = (result==3) ? true : false;
        Assertions.assertTrue(max);
    }
    
    @Test
    public void givenMaxNumber_NotAtThirdPosition_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result = userNumbers.findMaximum(10,20,6);
        boolean max = (result==6) ? true : false;
        Assertions.assertFalse(max);
    }
}
