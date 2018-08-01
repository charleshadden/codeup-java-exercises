import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);



    //Testing 1
        

//    addition(1, 4);
//    subtraction(4,7);
//    multiplication(4,4);
//    factoring();
//    division(12,3);
//    modulus(4,7);
//    guess();
//    dice();
//    countVowels("CharlesHadden");
//    capital("CharlesHadden");
//    getType( "five");
///   System.out.println(getType("5"));
//    System.out.println(getType(true));
//    calculator(input);
//    hangMan(input);
//        count("Hello");
        timeConversion();




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

//    public static void factoring() {
//        String yourResponse = "0";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10");
//        int yourNumber = input.nextInt();
//        System.out.println("Your number is " + yourNumber + "!");
//        System.out.println("Would you like to continue?(y/n)");
//        yourResponse = input.next();
//        if(yourResponse.equals("y")) {
//            int factor = 1;
//            while (yourNumber > 0) {
//                factor = yourNumber*factor;
//                yourNumber--;
//            }
//            System.out.println(factor);
//
//        } else {
//            System.out.println("Goodbye");
//
//            }
//
//        }


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

//    ================================= METHOD BONUSES
//------ 1 ------
//    Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
//    EXAMPLE...
//    INPUT: countVowels("cat")
//    OUTPUT:
//            |======== VOWEL COUNT ========|
//            | A's | E's | I's | O's | U's |
//            | 1   | 0   | 0   | 0   | 0   |
//            |=============================|
//    countVowels() will use...
//    countAs(),
//    countEs(),
//    countIs(),
//    countOs(),
//    and countUs()

        //    public static void countVowels(String one) {
        //        System.out.println("|=========VOWEL COUNT========|");
        //        System.out.println("| A's | E's | I's| O's | U's |");
        //        System.out.print("| ");
        //        System.out.print(countAs(one));
        //        System.out.print("   | ");
        //        System.out.print(countEs(one));
        //        System.out.print("   | ");
        //        System.out.print(countIs(one));
        //        System.out.print("  | ");
        //        System.out.print(countOs(one));
        //        System.out.print("   | ");
        //        System.out.print(countUs(one));
        //        System.out.println("   |");
        //        System.out.print("|============================|");
        //
        //    }
        //
        //        public static int countAs(String one) {
        //
        //        int counta = 0;
        //        for (int i = 0; i < one.length(); i++)
        //        {
        //            if (one.charAt(i) == 'a')
        //            {
        //                counta++;
        //            }
        //        }
        //        return counta;
        //    }
        //    public static int countEs(String one) {
        //
        //        int counte = 0;
        //        for (int i = 0; i < one.length(); i++)
        //        {
        //            if (one.charAt(i) == 'e')
        //            {
        //                counte++;
        //            }
        //        }
        //        return counte;
        //    }
        //    public static int countIs(String one) {
        //
        //        int counti = 0;
        //        for (int i = 0; i < one.length(); i++)
        //        {
        //            if (one.charAt(i) == 'i')
        //            {
        //                counti++;
        //            }
        //        }
        //        return counti;
        //    }
        //    public static int countOs(String one) {
        //
        //        int counto = 0;
        //        for (int i = 0; i < one.length(); i++)
        //        {
        //            if (one.charAt(i) == 'o')
        //            {
        //                counto++;
        //            }
        //        }
        //        return counto;
        //    }
        //    public static int countUs(String one) {
        //
        //        int countu = 0;
        //        for (int i = 0; i < one.length(); i++)
        //        {
        //            if (one.charAt(i) == 'u')
        //            {
        //                countu++;
        //            }
        //        }
        //        return countu;
        //    }

//------ 2 ------
//    Create a method that will return how many capital letters are in a string.

//            public static void capital(String one) {
//                System.out.println(countCaps(one));
//            }
//            public static int countCaps(String one) {
//
//                int count = 0;
//                for (int i = 0; i < one.length(); i++) {
//                    char c = one.charAt(i);
//                    if (Character.isUpperCase(c)) {
//                        count++;
//                    }
//                }
//                        return count++;
//            }




//            ------ 3 ------
//    Create a method, getType() that will take in an input and return a string describing the type of the value. Account for int, boolean, String, char, and double. Use method overloading.

        //
        //    public static boolean getType(String input) {
        //
        //        try {
        //            Integer.parseInt(input);
        //            return true;
        //        }catch(NumberFormatException e) {
        //            return false;
        //        }
        //    }
        //
        //    public static void getType(boolean input) {
        //
        //    }
        ////    public static void getType(double input) {
        ////
        ////    }
        //    public static void getType(char input) {
        //
        //    }



//------ 4 ------
//    Create a method to print out every letter in a string using recursion.
//public static void count(String n) {
//    int length = n.length();
//    if (n.length() <= 0) {
//        System.out.println("Done");
//    }
//    String last = n.substring(length-1, length);
//    return  last + last + last +  count(substring(0, length-1));
//    System.out.println(n.charAt(0));
//
//    count(n);
//
//}




//------ 5 ------
//    Create a method to determine if a string is a palindrome.
//------ 6 ------
//    Create a method that will convert a written out whole number from "zero" to "ninety-nine" and return the actual number.
//------ 7 ------
//    Create a command line calculator
//- the user may enter a number
//- the user may enter an operator
//- the user may enter a second number
//- the program should output a result, then prompt the user for another calculation

//    public static void calculator(Scanner input) {
////
//        System.out.println("Choose a number");
//        int num1 = input.nextInt();
//        System.out.println("Choose operator(+,-,*, or /)");
//        String operate = input.next();
//        System.out.println("Choose a 2nd number");
//        int num2 = input.nextInt();
//        System.out.println("Calculate(y/n)");
//        if(input.next().equals("y")) {
//            if(operate.equals("+")) {
//            System.out.println(num1 + num2);
//            } else if(operate.equals("-")){
//                System.out.println(num1 - num2);
//            } else if(operate.equals("*")) {
//                System.out.println(num1 * num2);
//            } else {
//                System.out.println(num1 / num2);
//            }
//        } else {
//            System.out.println("Try again");
//        }
//
//    }



//------ 8 ------
//    Build a time conversion application:
//    The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)

    public static void timeConversion() {
        Scanner input = new Scanner(System.in);
        String keepGoing;

        do {
            System.out.println("Enter time");
            int time = input.nextInt();
            input.nextLine();
            if(time < 1200) {
                System.out.println(time + 1200);
            } else {
                System.out.println(time - 1200);
            }

            System.out.println("Would you like to continue(y/n)");
            keepGoing = input.nextLine().toUpperCase().trim();
        } while(keepGoing.equals("Y"));
        System.out.println("Goodbye");
    }




//            ------ 10 ------
//    Create date format converter application.
//    Take in the following format:
//    MM/DD/YYYY
//    Output the following:
//    MonthName DD, YYYY
//    Example:
//    input - 12/01/1999
//    output - December 12, 1999

}
