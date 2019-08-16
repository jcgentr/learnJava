package com.jaredgentry;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000; // occupies 32 bits or 4 bytes; width = 32

	    int myMinIntValue = Integer.MIN_VALUE; // Integer is a wrapper class for int
	    int myMaxIntValue = Integer.MAX_VALUE;  // can now perform operations on an int
        System.out.println("Minimum Integer value: " + myMinIntValue);
        System.out.println("Maximum Integer value: " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1)); // overflow to min value
        System.out.println("Busted MIN value: " + (myMinIntValue - 1)); // underflow to max value

        int myMaxIntTest = 2_147_483_647; // 2147483648 flags an error; _ valid for Java 7 or higher

        byte myMinByteValue = Byte.MIN_VALUE; // could be used to document necessary small number; not typically used
        byte myMaxByteValue = Byte.MAX_VALUE; // 1 byte = 8 bits; width of 8
        System.out.println("Minimum Byte value: " + myMinByteValue);
        System.out.println("Maximum Byte value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; // occupies 16 bits, width = 16
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short value: " + myMinShortValue);
        System.out.println("Maximum Short value: " + myMaxShortValue);

        long myLongValue = 100; // will cast int to long if L not there; L tells java to treat # as a long
        long myMinLongValue = Long.MIN_VALUE; // occupies 64 bits, width = 64
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long value: " + myMinLongValue);
        System.out.println("Maximum Long value: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_534L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767; // 32767 gives type error

        int myTotal = (myMinIntValue / 2);
        // type casting
        byte myNewByteValue = (byte) (myMinByteValue / 2); // cast needed since 2 is treated as int and so is returned value
        short myNewShortValue = (short) (myMinShortValue / 2);
        // moral of the story: just use int unless absolutely need byte or short for some reason

        // CHALLENGE
        byte aByte = 113;
        short aShort = 1864;
        int anInt = 5998;
        long aLong = 50_000 + (10 * (aByte + aShort + anInt)); // smaller to larger (int to long) no cast needed
        System.out.println("My Long Value: " + aLong);

        short shortTotal = (short) (1000 + 10 *
                (aByte + aShort + anInt)); // larger to smaller (int to short) cast is needed
        System.out.println("My Short Value: " + shortTotal);
    }
}
