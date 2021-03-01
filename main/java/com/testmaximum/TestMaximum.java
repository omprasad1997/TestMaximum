package com.testmaximum;

public class TestMaximum {
    Integer xInt,yInt,zInt;

    public TestMaximum() {
        this.xInt = xInt;
        this.yInt = yInt;
        this.zInt = zInt;
    }

    public static Integer findMaximum(Integer xInt, Integer yInt, Integer zInt) {
        Integer max = yInt;
        if(xInt.compareTo(max) > 0)
            max = xInt;
        if(zInt.compareTo(max) > 0)
            max = zInt;
        return max;
    }
}
