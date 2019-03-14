import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard;
        //int's
        int pickedNumber;
        int go = 0;
        int numberOfTries = 0;
        keyboard = new Scanner(System.in);
        Random generator = new Random();
        String keepGoing;

        Scanner continueKB;
        continueKB = new Scanner(System.in);


        System.out.println("Hola! Pick a number between 1 and 1000 to win!");
        while (go == 0) {

            System.out.println("Pick a number between 1-1000");
            pickedNumber = keyboard.nextInt();

            int numberToWin = generator.nextInt(1000);

            boolean win = false;


            numberOfTries++;
            while (!win) {


                if (pickedNumber == numberToWin) {
                    win = true;
                    System.out.println(numberToWin);
                    System.out.println();


                } else if (pickedNumber < numberToWin) {
                    System.out.println("The number you have chosen is too low. Guess again:");
                    pickedNumber = keyboard.nextInt();
                } else if (pickedNumber > numberToWin) {
                    System.out.println("The number you have chosen is too high. Guess again:");
                    pickedNumber = keyboard.nextInt();
                }
            }


            System.out.println("You won! The number you have chosen, " + pickedNumber + " was the right number! ");
            System.out.println("Would you like to play again?");
            System.out.println("Type 'y' for yes or 'n' for no.");
            keepGoing = continueKB.nextLine();
            go = keepGoing.indexOf("y");


        }


    }

}

