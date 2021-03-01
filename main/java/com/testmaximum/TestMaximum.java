package com.testmaximum;

public class TestMaximum<T extends Comparable <T>>{
    T x,y,z;

    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public TestMaximum() {

    }
    public static <T extends Comparable <T>> T  findMaximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }
}
