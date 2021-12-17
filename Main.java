/*
* The "XX" program
*
* @author  Darien RH
* @version 1.0
* @since   2021-12-16
*/

import java.util.Scanner;

/**
* XX.
*/
final class Main {

    /**
    * 144.
    */
    public static final int C144 = 144;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    public static float boardFoot(float width, float height) {
        float length;
        length = C144 / (width * height);
        return length;
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final float width;
        final float height;
        final float length;

        final Scanner myInput = new Scanner(System.in);

        // Block of code to try
        try {
            System.out.print("Please enter the board width.  ");
            width = myInput.nextFloat();

            System.out.print("Please enter the board height.  ");
            height = myInput.nextFloat();

            length = boardFoot(width, height);
            System.out.println("The wood should be " + length
              + " inch(es) long.");

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
          System.out.println("\nYou have not entered a valid input.");
        }
    }
}
