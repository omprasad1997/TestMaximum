package com.testmaximum;

public class TestMaximum {
    Integer xInt,yInt,zInt;

    public TestMaximum() {
        this.xInt = xInt;
        this.yInt = yInt;
        this.zInt = zInt;
    }

    public static Integer findMaximum(Integer xInt, Integer yInt, Integer zInt) {
        Integer max = zInt;
        if(xInt.compareTo(max) > 0)
            max = xInt;
        if(yInt.compareTo(max) > 0)
            max = yInt;
        return max;
    }
}
