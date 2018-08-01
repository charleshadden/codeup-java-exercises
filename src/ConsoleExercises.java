import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[]args) {
//        double pi = 3.14159;
//
//        System.out.format("The value of variable pi is equal to approximately: %10.2f%n ", pi);
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int yourNumber = input.nextInt();
//
//        System.out.println("You entered:    \"" + yourNumber + "\"   ");
//
//
//
//        System.out.print("Enter first word.");
//        String word1 = input.next();
//        System.out.print("Enter second word.");
//        String word2 = input.next();
//        System.out.print("Enter third word.");
//        String word3 = input.next();
//
//        System.out.println("Your chosen words are " + word1 + word2 + word3);
//
//
//
//        System.out.print("Enter length");
//        float length = input.nextFloat();
//        System.out.print("Enter width");
//        float width = input.nextFloat();
//        System.out.print("Enter height");
//        float height = input.nextFloat();
//
//        float area = length * width;
//        float perimeter = (length * 2) + (width * 2);
//        float volume = width * height * length;
//
//        System.out.println("The area is " + area);
//        System.out.println("The perimeter is " + perimeter);
//        System.out.println("The volume is " + volume);
//        input.nextLine();
//
//        System.out.println("Enter a sentence");
//        String sent1 = input.nextLine();
//
//        System.out.println(sent1);

//        Prompt the user to enter a favorite quote
//        Output the quote
//        Ask them to enter how many words are in the quote
//        Output the number they entered

//        System.out.println("Enter favorite quote");
//        String quote = input.nextLine();
//        System.out.println(quote);
//
//        System.out.print("How many words are in that quote");
//        int howMany = input.nextInt();
//        System.out.println(howMany);


//        Prompt the user to enter a list of top three favorite foods separated by only spaces
//        Use the printf() to output there three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood


//        System.out.println("Enter 3 favorite foods separated by only spaces!");
//        String strSentence = input.nextLine();
//        String[] parts = strSentence.split(" ");
//
//        System.out.println("1) " + parts[0]);
//        System.out.println("2) " + parts[1]);
//        System.out.println("3) " + parts[2]);




//        Prompt the user to enter a grocery list of three items
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
//        Output the result as a comma-separated list using printf()

        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter 3 grocery items separated with commas, no spaces");
        String strSentence1 = input.nextLine();

        input1.useDelimiter(" ");
        System.out.println(strSentence1);


        }

}
