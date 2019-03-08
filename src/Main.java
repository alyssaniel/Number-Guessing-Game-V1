import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard;
        int pickednumber;
        int go = 0;
        keyboard= new Scanner(System.in);
        Random generator = new Random();







        System.out.println("Hola! Pick a number between 1 and 1000 to win!");
        while (go == 0) {


            int numberToWin = generator.nextInt(1000);
            System.out.println(numberToWin);
            boolean win = false;
            System.out.println("Pick a number between 1-1000");
            pickednumber = keyboard.nextInt();
        }




    }
}
