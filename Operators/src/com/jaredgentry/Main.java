package com.jaredgentry;

public class Main {

    public static void main(String[] args) {
	    /*
	    int myVar = 6 + 5;
	    + is the operator, 6 and 5 are the operands (variables instead of literals are also called operands)
	    operand: any Object manipulated by operator (special symbols to perform specific operations)
	    expression: formed by combining variables, literals, method return values, and operators
	    int myValue = 9 + 11;   here, 9 + 11 is the expression
	    double mySalary = hoursWorked * hourlyRate;    here, hoursWorked * hourlyRate is the expression
	     */
	    int result = 1 + 3; // two operators: addition and assignment
        System.out.println("result: " + result);
        int previousResult = result; // deep copy
        System.out.println("previousResult: " + previousResult);
        result -= 2;
        System.out.println("result: " + result);
        System.out.println("previousResult: " + previousResult);

        result = result * 2;
        System.out.println("\n" + result);
        result = result / 2;
        System.out.println(result);
        result %= 2;
        System.out.println(result);

        // ++, --, +=, etc

        // Conditional Logic
        boolean isAlien = false;
        if (isAlien == true) // simplified to !isAlien
            System.out.println("It is not an alien!"); // no brackets: only one line executed below it, rest continues like normal
            System.out.println("not in if statement code block"); // code block: allows >=1 statement to be executed

        if (!isAlien) { // good practice: always use a code block
            System.out.println("It is not an alien!");
            System.out.println("in if statement code block");
        }

        int topScore = 99;
        if (topScore <= 100) { // <, <=, >, >=, ==, !=
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) { // logical AND &&, ||, bitwise AND &, |
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 100) || (secondTopScore < 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // BE CAREFUL
        boolean isFunny = false;
        if (isFunny = true) { // isFunny assigned to true and that boolean is used in if statement
            System.out.println("Oops, this isn't suppose to happen");
        }
        // logical complement operator: ! or NOT operator
        // (isFunny) tests for true, (!isFunny) tests for opposite of value is true, so is it false

        // Ternary operator: shortcut of if-then-else statement
        isFunny = true;
        boolean wasFunny = isFunny ? true : false; // is condition true? assign if true : assign if false
        if (wasFunny) {
            System.out.println("is and was Funny true");
        }

        int age = 21;
        boolean is21orOver = (age >= 21) ? true : false;
        System.out.println(is21orOver);

        // CHALLENGE
        System.out.println("\n================ CHALLENGE ==================\n"); // operator precedence

        double myFirstDouble = 20.00;
        double mySecondDouble = 80.00;
        double myTotal = (myFirstDouble + mySecondDouble) * 100.00; // final result will be false is no parentheses
        double myRemainder = myTotal % 40.00;
        boolean isZeroRemainder = (myRemainder == 0) ? true : false;

        System.out.println(myRemainder + "    " + isZeroRemainder);

        if (!isZeroRemainder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder");
        }

    }
}
