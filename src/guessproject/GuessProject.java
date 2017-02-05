/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 55jkagle
 */
public class GuessProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            int number = rand.nextInt(10) + 1;
            System.out.println("Type a number between 1 and 10");
            int choice = Integer.parseInt(sc.nextLine());

            while (number != choice) {
                if (choice > number) {
                    System.out.println("That's too high.  Try again.");
                }
                if (choice < number) {
                    System.out.println("That's too low.  Try again.");
                }
                System.out.println("Type a number between 1 and 10");
                choice = Integer.parseInt(sc.nextLine());
            }

            System.out.println("That's it! The number was " + number + "!");
            System.out.println("Would you like to play again? (y/n)?");
            again = sc.nextLine();
        }
    }
}
