import java.util.Scanner;

public class HangMan {

    public static String yourWord = "";
    public static int MAX_GUESSES = 8;
    public static int score, guesses;
    public static Scanner input;

    public static void main(String[] args) {

        score = guesses = 0;
        input = new Scanner(System.in);

        Rules(input);
        initGame();

        input.close();

    }

    public static void Rules(Scanner input) {

        System.out.println("Player 1 Enter a word!");
        yourWord = input.nextLine().toUpperCase().trim();
        System.out.println("This word has " + yourWord.length() + " Letters\n");

        makeLine();

        System.out.println("Welcome to Hang Man. The rules are simple:\n" +
                "You have " + MAX_GUESSES + " guesses to guess the Word.\n" +
                " If you cannot guess correctly in " + MAX_GUESSES + " turns you HANG.\n\n");

        for (int i = 1; i <= yourWord.length(); i++) {
            System.out.print(" _");
        }

    }

    public static void initGame() {
        for (int i = 0; i < MAX_GUESSES; i++) {


            char letter = yourTurn();
            System.out.println("You guessed: " + letter + "\n");

            isCorrect(letter);

            if(MAX_GUESSES > 8) {
                gameDone();

            }

            if(score == yourWord.length()) {
                gameDone();
                break;
            }
            guesses++;

            System.out.println("Number of guesses: "+ guesses +
            "\nScore: " + score + "\n");
            System.out.println(letter);
        }
        System.out.println("TEST");
    }

    public static char yourTurn(){

        System.out.println("\nGo ahead and take a guess.");
        String guess = input.nextLine().toUpperCase().trim();


        return guess.charAt(0);

    }

    public static void isCorrect(char letter) {


        for(int i = 0; i < yourWord.length(); i++) {

            if(yourWord.charAt(i) == letter) {
                score++;
                System.out.println("Great Guess!!");
            }
        }
    }

    public static void gameDone() {

        if(score == yourWord.length()) {
            System.out.println("Congratulations! You Win!");
            MAX_GUESSES = 0;

        } else {
            System.out.println("Loser");
            MAX_GUESSES = 0;
        }
        System.out.println("The word was: " + yourWord + "\nGoodbye");
        makeLine();
    }



    public static void makeLine() {
        System.out.println("\n---------------------------------------------\n");
    }


}
//    Create a command line Hangman game:
//            - prompt player 1 for a word
//  - player 2 (p2) has 9 guesses to correctly identify the word
//  - each round, display to the user...
//            1. the current visible letters of the word
//    2. the letters already incorrectly guessed
//    3. the number of guesses remaining
//  - at any round, they may guess a letter or multiple letters to complete the word
//    - if p2 guesses correctly, they WIN! and ask if they want to play again
//    - if p2 guesses wrong, they LOSE!
//            - if p2 runs out of guesses, they LOSE!




