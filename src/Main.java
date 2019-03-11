import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard;
        int pickedNumber;
        int go = 0;
        keyboard= new Scanner(System.in);
        Random generator = new Random();

        int numberOfTries = 0;






        System.out.println("Hola! Pick a number between 1 and 1000 to win!");
        while (go == 0) {

            System.out.println("Pick a number between 1-1000");
            pickedNumber = keyboard.nextInt();

            int numberToWin = generator.nextInt(1000);
            System.out.println(numberToWin);
            boolean win = false;


            numberOfTries++;
            while (!win) {


                if (pickedNumber == numberToWin) {
                    win = true;


                } else if (pickedNumber < numberToWin) {
                    System.out.println("The number you have chosen is too low. Guess again:");
                    pickedNumber = keyboard.nextInt();
                } else if (pickedNumber > numberToWin) {
                    System.out.println("The number you have chosen is too high. Guess again:");
                    pickedNumber = keyboard.nextInt();
                }
              }




            }










        }




    }

