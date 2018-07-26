import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int yourNum = 0;
        Scanner input = new Scanner(System.in);

        Random rand1 = new Random();
        int n1 = rand1.nextInt(100) + 1;

        int turnCount = 0;

        for(turnCount = 8; turnCount >= 0; turnCount--){

            System.out.println("Guess a number between 1 and 100");
            yourNum = input.nextInt();
            if (yourNum == n1) {
                System.out.println("Good Guess");

                break;
            } else if (yourNum < n1) {
                System.out.println("Higher Choose "+ turnCount + " more times!\"");

            } else {
                System.out.println("Lower Choose " + turnCount + " more times!");

            }


        }
    }
}




