public class Hello {
//    public: an access modifier allows us to define scope (how other parts of code can access this code)
/*
    class and public are keywords
    { } denote class code block
    main method is what Java looks for when running a Java program; it's the entry pt. of any Java code
*/
    public static void main (String[] args) {
        System.out.println("Hello Jared");

        // variables
        int myFirstNumber = (23 + 10) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = myTotal - 1000;

        // sout + [tab] -> println shortcut
        System.out.println("My First Number is: " + myFirstNumber);
        System.out.println("My Total: " + myTotal);
        System.out.println("My Last Int: " + myLastOne);

        // primitive types: int, boolean, byte, char, short, long, float, double
        // they are the building blocks of data manipulation
    }
}
