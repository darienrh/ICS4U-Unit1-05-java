/*
* The "Template" program is a template
*
* @author  Darien RH
* @version 1.0
* @since   2021-12-XX
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Main {

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
        length = 144 / (width * height);
        return length;
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        float width;
        float height;
        final float length;

        final Scanner myInput = new Scanner(System.in);

        // Block of code to try
        try {
            System.out.print("Please enter the board width.  ");
            width = myInput.nextFloat();
            while (width <= 0) {
                System.out.print("Sorry only positive numbers are accepted.  Enter the width. ");
                width = myInput.nextFloat();  // Retry Input
        }
            System.out.print("Please enter the board height.  ");
            height = myInput.nextFloat();
            while (height <= 0) {

                System.out.print("Sorry only positive numbers are accepted.  Enter the height. ");
                height = myInput.nextFloat();  //Retry Input
            }
            length = boardFoot(width,height);
            System.out.println("The wood should be " + length + " inch(es) long.");

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
          System.out.println("\nYou have not entered a valid input.");
        }
    }
}
