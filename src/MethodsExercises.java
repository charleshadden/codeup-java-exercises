import java.util.Scanner;

public class MethodsExercises {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//    addition(1, 4);
//    subtraction(4,7);
//    multiplication(4,4);
        factoring();
//    division(12,3);
//    modulus(4,7);
//        guess();
//        dice();
    }
//    public static void addition(int one, int two) {
//        System.out.println(one + two);
//    }
//
//    public static void subtraction(int one, int two) {
//        System.out.println(one - two);
//    }

//    public static void multiplication(int one, int two) {
//        System.out.println(one * two);
//    }

//    public static void division(int one, int two) {
//        System.out.println(one / two);
//    }
//
//    public static void modulus(int one, int two) {
//        System.out.println(one % two);
//    }
//    public static void multiplication(int one, int two) {
//        for(int i = one; i <= two; i++){
//            System.out.println(i);
//        }
//
//    }

//    public static int multiplication(int one, int two) {
//        if (one == 0 || two == 0) {
//            return 0;
//        } else {
//            return one + multiplication(one,two-1);
//            }
//    }

    public static void factoring() {
        String yourResponse = "0";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int yourNumber = input.nextInt();
        System.out.println("Your number is " + yourNumber + "!");
        System.out.println("Would you like to continue?(y/n)");
        yourResponse = input.next();
        if(yourResponse.equals("y")) {
            int factor = 1;
            while (yourNumber > 0) {
                factor = yourNumber*factor;
                yourNumber--;
            }
            System.out.println(factor);

        } else {
            System.out.println("Goodbye");

            }

        }


//    public static void dice() {
//        Scanner input = new Scanner(System.in);
//        int yourDie =0;
//        String decide = "0";
//        System.out.println("What size die do you choose");
//        yourDie = input.nextInt();
//
//        System.out.println("Your die is " + yourDie + ". Are you ready to roll?(y/n)" );
//        input.nextLine();
//        decide = input.nextLine();
//
//        if(decide.equals("y")) {
//            Random rand1 = new Random();
//            int n1 = rand1.nextInt(yourDie) + 1;
//            System.out.println(n1);
//
//            Random rand2 = new Random();
//            int n2 = rand2.nextInt(yourDie) + 1;
//            System.out.println(n2);
//
//            System.out.println("Your two rolls total " + n1 + n2);
//        } else {
//            System.out.println("Bye");
//        }
//
//    }

}
