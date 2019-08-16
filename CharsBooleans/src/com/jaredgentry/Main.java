package com.jaredgentry;

public class Main {

    public static void main(String[] args) {
        /* char: 16 bits or 2 bytes
            uses Unicode (international encoding standard); letters stored as unique numeric values
            some languages need more characters than 26 letters in English alphabet
            65535 possible different types of characters
         */
	    char myChar = 'D'; // only can store 1 character; USE SINGLE QUOTES
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myYenChar = '\u00A5';
        char myCopyrightChar = '\u00A9';
        System.out.println(myYenChar + " " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);

    }
}
