package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnTrue(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result = userNumbers.findMaximum(2,3,1);
        boolean max = (result==3) ? true : false;
        Assertions.assertTrue(max);
    }

    @Test
    public void givenMaxNumber_NotAtSeconndPosition_ShouldReturnFalse(){
        TestMaximum userNumbers = new TestMaximum();
        Integer result = userNumbers.findMaximum(10,6,5);
        boolean max = (result==6) ? true : false;
        Assertions.assertFalse(max);
    }
}
