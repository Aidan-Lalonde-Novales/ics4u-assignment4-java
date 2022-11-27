/*
* This program generates an hour glass.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-11-25
*/

import java.util.Scanner;

/**
 * This is an hourglass Program.
 */
final class Hourglass {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException
     *
     */
    private Hourglass() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Function generates an hourglass using user input.
    *
    * @param stars - stars to be added to the hourglass.
    * @param spaces - spaces to be added to the hourglass.
    */
    static void hourglass(final int stars, final int spaces) {
        // variable to be outputted each recursion
        String currentOutput = "";

        // base case
        if (stars != 0) {
            // add spaces
            for (int count = 0; count < spaces; count++) {
                currentOutput += " ";
            }
            // add stars
            for (int count = 0; count < stars; count++) {
                currentOutput += "* ";
            }
            System.out.println(currentOutput);
            hourglass(stars - 1, spaces + 1);
            System.out.println(currentOutput);
        }
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Scanner inputObj = new Scanner(System.in);
        System.out.print("How Tall Would You Like Your Hourglass? ");
        try {
            final int userInt = inputObj.nextInt();
            if (userInt > 0) {
                System.out.println("");
                hourglass(userInt, 0);
            } else {
                System.out.println("\nInvalid Input. (lesser or equal to 0)");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input. (string)");
        }
        System.out.println("\nDone.");
    }
}
