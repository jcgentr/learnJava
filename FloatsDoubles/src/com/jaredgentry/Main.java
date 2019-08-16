package com.jaredgentry;

public class Main {

    public static void main(String[] args) {
	    // Float: single precision -> occupies 32 bits or 4 bytes; width = 32
        // Double: double precision -> occupies 64 bits or 8 bytes; width = 64
        // float: 1.4e-45 to 3.40..e38
        // double: 4.9e-324 to 1.79..e308
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 4;
        float myFloatValue = 5.25f; // double is default floating point type in Java, must cast
        float myFloat = (float) 6.78; // so just use double
        double myDoubleValue = 5.25;
        double myDouble = 4.56d;

        int anInt = 5 / 3; // floors result
        float aFloat = 5f / 3f; // always good to be explicit with types
        double aDouble = 5d / 3d; // doubles processed faster on modern computers and default in math libs; USE DOUBLE not FLOAT
        // double aDouble = 5.00 / 3.00;
        System.out.println("Int: " + anInt);
        System.out.println("Float: " + aFloat);
        System.out.println("Double: " + aDouble);

        // CHALLENGE
        double pounds = 200;
        double kilograms = 0.45359237 * pounds;
        System.out.println(pounds + " lbs = " + kilograms + " kg");

        /*
        IMPORTANT NOTE: float and double are OK for general calculations
            However, use BigDecimal class if you need precise calculations, like for currency calculations
            due to how floating point numbers are stored, they are not good for precise calculations
         */
    }
}
