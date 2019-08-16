package com.jaredgentry;

// tell compiler to use pre-written Array methods
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // two ways to declare arrays

	    int[] userAge; // preferred; declares array variable
	    //int userAge2[]; // C/C++ way

	    userAge = new int[] {21, 22, 23, 24, 25}; // creates array and assign to userAge

        int[] userAge2 = new int[] {21, 22, 23, 24, 25};

        int[] userAge3 = {21, 22, 23, 24, 25};

        int[] userAge4 = new int[5];

        userAge[0] = 31;
        userAge[2] = userAge[1] + 20;

        // Array methods
        boolean result1 = Arrays.equals(userAge, userAge2);
        boolean result2 = Arrays.equals(userAge2, userAge3);
        System.out.println("1: " + result1 + "    2: " + result2);

        int[] partialCopyOfUserAge = Arrays.copyOfRange(userAge, 1, 4); // middle 3 numbers copied to new array

        // use toString() to print arrays easily
        System.out.println(Arrays.toString(userAge));
        System.out.println(Arrays.toString(partialCopyOfUserAge));
        // sort() is in-place
        Arrays.sort(userAge);
        System.out.println(Arrays.toString(userAge));

        int foundIndex = Arrays.binarySearch(userAge, 24);
        int notFoundIndex = Arrays.binarySearch(userAge, 23);
        System.out.println("Found 24 at index: " + foundIndex);
        System.out.println("Result after looking for 23: " + notFoundIndex); // - means not found; 2 means should be at index 1 +1 = 2

        String test = "Test";
        System.out.println("Length of String: " + test.length()); // length() is a method in String class
        System.out.println("Length of Array: " + userAge.length); // length is a field/attribute in Array class
    }
}
