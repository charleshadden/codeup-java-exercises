import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        int i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1000);

//        for(int i = 100; i >= -10; i -=5) {
//            System.out.print(i);
//        }
//        int i;
//        for(i = 1; i <= 100; i++) {
//            boolean fizzOrBuzz = false;
//
//            if(i % 3 == 0) {
//            System.out.print("fizz");
//            fizzOrBuzz = true;
//            }
//            if(i % 5 == 0) {
//            System.out.print("buzz");
//            fizzOrBuzz = true;
//            }
//
//            if (fizzOrBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(i);
//            }
//            }

        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int yourNumber = input.nextInt();
//            System.out.println("Here is your table \n\"");
//            System.out.print("number  |  squared  |  cubed \n\"");
//            System.out.print("------------------------------  \n\"");
//        int i;
//        for(i = 1; i <= yourNumber; i++){
//            System.out.format("%3s%10d%14s", i ,  i * i, i * i * i);
//            System.out.print( i + "\n");

//        String answer="";
        do{
            System.out.print("Enter a Grade: ");
            int yourGrade = input.nextInt();


            if (yourGrade > 95) {
                System.out.println("You received an A+");
            } else if (yourGrade > 90) {
                System.out.println("You received an A");
            } else if (yourGrade > 85) {
                System.out.println("You received a B+");
            } else if (yourGrade > 80) {
                System.out.println("You received a B");
            } else if (yourGrade > 75) {
                System.out.println("You received a C+");
            } else if (yourGrade > 70) {
                System.out.println("You received a C");
            } else if (yourGrade > 65) {
                System.out.println("You received a D+");
            } else if (yourGrade > 60) {
                System.out.println("You received a D");
            } else {
                System.out.println("You received an F");
            }
            System.out.println("do you want to continue?");
            answer=input.next();
        }while(answer.equals("y"));

    }

}
