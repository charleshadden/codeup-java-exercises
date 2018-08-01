import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int yourNum = 0;
        Scanner input = new Scanner(System.in);

        Random rand1 = new Random();
        int n1 = rand1.nextInt(100) + 1;

        int turnCount = 0;
            System.out.println("Guess a number between 1 and 100");

        for(turnCount = 8; turnCount >= 0; turnCount--){

            yourNum = input.nextInt();
            if (yourNum == n1) {
                System.out.println("Good Guess You WIN!!!");

                break;
            } else if (yourNum < n1) {
                System.out.println("Higher Choose "+ turnCount + " more times!\"");

            } else if (yourNum > n1){
                System.out.println("Lower Choose " + turnCount + " more times!");

            } else if (turnCount == 0){
                System.out.println("You Lost");
            } else {
                System.out.println("You Lost");
            }


        }
    }
}




