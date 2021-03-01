package com.testmaximum;

public class TestMaximum {
    String xString,yString,zString;

    public TestMaximum(String xString, String yString, String zString) {
        this.xString = xString;
        this.yString = yString;
        this.zString = zString;
    }

    public TestMaximum() {

    }
    public static String findMaximum(String xString, String yString, String zString) {
        String max = yString;
        if(xString.compareTo(max) > 0)
            max = xString;
        if(zString.compareTo(max) > 0)
            max = zString;

        return max;
    }
}
