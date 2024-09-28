import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Numbergame {

    public static void main(String args[]) throws IOException {
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n HEY Welcome to number guessing game!!.\nThe System will generate a random number b/w 1-100.");
        System.out.println(
                "U have to guess arandom number.\nYour score will be the number of attempts you took to guess the number.\n");
        System.out.print("Enter the Number of Rounds (b/w 1-5) U want to play the Game : ");
        int rounds = obj.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.println();
            System.out.println("Round " + i + " starts! ...\n");

            System.out.println(
                    "Please Enter the Difficulty Level:\n1 --> Easy [There is No Limit ]\n2 --> Hard [There is Limit ]");
            int limits = obj.nextInt();

            switch (limits) {
                case 1: {
                    System.out.println("Opted for Easy Difficulty.\nHence, there is No Limit to number of attempts\n");

                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (true) {
                        System.out.print("Enter you guess number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess
                                    + " is BIGGER than Generated Number. You have to Guess again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess
                                    + " is SMALLER than Generated Number. You have to Guess again...");
                        } else {
                            System.out.println(
                                    "The number " + guess + " is EQUAL to than Generated Number.\nCongoo it took you "
                                            + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Opted for Hard Difficulty.\nHence, there is a Limit to number of attempts");
                    System.out.println(
                            "The limit is just 5.\nIf you have guessed the number in 5 or less attempts you have won the game.\n Else you will lose the game.\n");
                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (count <= 5) {
                        System.out.println("\nNo of guesses remaining : " + (6 - count) + " ...\n");
                        System.out.print("Enter you guess number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess
                                    + " is BIGGER than Generated Number. You have to Guess again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess
                                    + " is SMALLER than Generated Number. You have to Guess again...");
                        } else {
                            System.out.println(
                                    "The number " + guess + " is EQUAL to than Generated Number.\nCongrats it took you "
                                            + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    if (count > 5) {
                        System.out.println(
                                "OOPS!!! You were not able to guess the number in 5 attempts.\nThe Generated Number was "
                                        + randomNumber + "\n Cool guyss better luck next time!! \n");
                    }
                    break;
                }
                default: {
                    System.out.println("--- WRONG INPUT ---\n Sorry!!! But this round has been wasted.");
                    break;
                }
            }

            System.out.println("ROUND " + i + " is OVER.");
        }
        System.out.println("\nAll the Rounds are over.\nThank You for Playing the Game.\nHope you  guys enjoyed it.");
        obj.close();
    }
}