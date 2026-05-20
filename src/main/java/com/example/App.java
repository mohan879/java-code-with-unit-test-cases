package com.example;

/**
 * A simple utility class for basic arithmetic operations.
 */
public class App {
    /** Constant for the number 5. */
    private static final int FIVE = 5;
    
    /** Constant for the number 3. */
    private static final int THREE = 3;
    
    /** Constant for the number 4. */
    private static final int FOUR = 4;

    /**
     * Returns a greeting message.
     *
     * @return a greeting string
     */
    public String getGreeting() {
        return "Hello, World!";
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(final int a, final int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    public int subtract(final int a, final int b) {
        return a - b;
    }

    /**
     * Checks if a number is even.
     *
     * @param number the number to check
     * @return true if the number is even, false otherwise
     */
    public boolean isEven(final int number) {
        return number % 2 == 0;
    }

    /**
     * Main method to demonstrate the App class functionality.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("5 + 3 = " + app.add(FIVE, THREE));
        System.out.println("5 - 3 = " + app.subtract(FIVE, THREE));
        System.out.println("Is 4 even? " + app.isEven(FOUR));
    }
}
