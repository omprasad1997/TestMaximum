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
        String max = xString;
        if(yString.compareTo(max) > 0)
            max = yString;
        if(zString.compareTo(max) > 0)
            max = zString;

        return max;
    }
}
