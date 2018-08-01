import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to say to Bob?");
        String yourText = input.nextLine();
        if(yourText.endsWith("?")){
            System.out.println("Sure.");
        } else if(yourText.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if(yourText.isEmpty()){
            System.out.println("Fine, Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}


