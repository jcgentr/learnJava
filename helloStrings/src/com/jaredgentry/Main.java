package com.jaredgentry;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World";
        String emptyStr = "";
        String myName = "Hello World, " + "my name is Jared";
        String myName2 = "Hello World, my name is Jared";
        int myLength = "Hello World".length();
        System.out.println(myLength);

        String uCase = "hello world".toUpperCase();
        String lCase = "HELLO WORLD".toLowerCase();
        System.out.println(uCase + "    " + lCase);

        String firstSubstring = "Hello World".substring(6); // starting from index 6 to end of string
        System.out.println(firstSubstring);

        String secondSubstring = message.substring(1,8); // start index (inclusive), end index (not inclusive)
        System.out.println(message + " has a substring of " + secondSubstring);

        char myChar = message.charAt(1);
        System.out.println("char at index 1: " + myChar);

        boolean equalStringsOrNot = "My name is Jared".equals("My name is Jared");
        boolean equalStringsOrNot2 = "Love".equals("Hate");
        System.out.println("1: " + equalStringsOrNot + "   2: " + equalStringsOrNot2 );

        String names = "Peter, Jake, John, Ryan";
        String[] splitNames = names.split(", ");

        for (int i=0; i<splitNames.length; i++) {
            System.out.print(splitNames[i] + " "); // print has no new line like println
        }

    }
}
