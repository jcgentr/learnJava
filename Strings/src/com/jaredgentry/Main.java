package com.jaredgentry;

public class Main {

    public static void main(String[] args) {
        // Recap on 8 primitive data types: int, boolean, double, float, char, byte, short, long
        // most used: double, int, boolean
        /*
        String: a class in Java; but since it's favored in programming, it is easier to use than other custom Classes
        A string is just a sequence of characters. Limited to 2.14 billion characters.
         */
        String myString = "This is a string"; // DOUBLE QUOTES; Class types are capitalized
        System.out.println("myString is equal to " + myString);
        myString += ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString += " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString += "45.67";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // Java will cast int to String and do concatenation; operator overload
        System.out.println("lastString is equal to " + lastString);

        double myDouble = 59.76;
        lastString = lastString + myDouble; // new String created and old one discarded; not a good way to append, use StringBuffer instead
        System.out.println("lastString is equal to " + lastString);

        /*
        Strings are Immutable in Java: can't change String after it's created, instead a new String is created
         */
    }
}
