package com.testmaximum;

public class TestMaximum {
    Float xFloat,yFloat,zFloat;

    public TestMaximum(Float xFloat, Float yFloat, Float zFloat) {
        this.xFloat = xFloat;
        this.yFloat = yFloat;
        this.zFloat = zFloat;
    }

    public TestMaximum() {

    }

    public static Float findMaximum(Float xFloat, Float yFloat, Float zFloat) {
        Float max = xFloat;
        if(yFloat.compareTo(max) > 0)
            max = yFloat;
        if(zFloat.compareTo(max) > 0)
            max = zFloat;
        return max;
    }
}
