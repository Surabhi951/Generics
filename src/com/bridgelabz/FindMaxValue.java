package com.bridgelabz;

public class FindMaxValue {

    public static Integer testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("The maximum value between 3 integer is: " + testMaximum(30,20,10));
    }
}
