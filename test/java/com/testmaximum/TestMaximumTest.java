package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result = userNumbers.findMaximum(3,2,1);
        boolean max = (result==3) ? true : false;
        Assertions.assertTrue(max);
    }


    @Test
    public void givenMaxNumber_NotAtFirstPosition_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result = userNumbers.findMaximum(6,10,5);
        boolean max = (result==6) ? true : false;
        Assertions.assertFalse(max);
    }
}
