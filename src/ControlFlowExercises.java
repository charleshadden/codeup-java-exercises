import java.util.Random;
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
//        do{
//            System.out.print("Enter a Grade: ");
//            int yourGrade = input.nextInt();
//
//
//            if (yourGrade > 95) {
//                System.out.println("You received an A+");
//            } else if (yourGrade > 90) {
//                System.out.println("You received an A");
//            } else if (yourGrade > 85) {
//                System.out.println("You received a B+");
//            } else if (yourGrade > 80) {
//                System.out.println("You received a B");
//            } else if (yourGrade > 75) {
//                System.out.println("You received a C+");
//            } else if (yourGrade > 70) {
//                System.out.println("You received a C");
//            } else if (yourGrade > 65) {
//                System.out.println("You received a D+");
//            } else if (yourGrade > 60) {
//                System.out.println("You received a D");
//            } else {
//                System.out.println("You received an F");
//            }
//            System.out.println("do you want to continue?");
//            answer=input.next();
//        }while(answer.equals("y"));

        //Command Line Adventure Game\\
        int gold = 0;
        int hp = 20;
        String outcome = "0";
        String userclass = "0";
        String outcome2 = "0";
        String direction = "0";
        String ready = "0";
        String fightFlight1 ="0";
        String weapon = "0";
        System.out.print("Welcome Adventurer, What is your name?");
        String yourName = input.nextLine();
        System.out.print("Are you ready to begin your adventure " + yourName + "?" + "(y/n)");
        outcome = input.next();
        if(outcome.equals("y")) {
            System.out.println("----CHAPTER 1-------");
            System.out.print("Tell us more about yourself. Are you a warrior or a magic-user?");
            userclass = input.next();
            if(userclass.equals("warrior")) {
                System.out.print("Ah Good, Just what we need for this quest. Nice Sword! ");
                 weapon = "sword";
            } else {
                System.out.print("Ah a wizard, you'll do great out here. Nice Staff! ");
                 weapon = "staff";
            }
        } else {
            System.out.print("Not everyone is cut out for bravery and great things.");
        }
        System.out.printf("Now that we have got that settled,%n we should get down to business." +
                " A group of ogres have been attacking our city for years %n and we need you to take care of them for us.%n" +
                "They are to the West of town. Are you ready to leave now?(y/n)");
        outcome2 = input.next();
        if(outcome2.equals("y")) {
            System.out.print("Which direction would you like to go?(E,S,W, or N)");
            direction = input.next();
            if(direction.equals("w")) {
                System.out.printf("As you head out of town to the West....");
                Random rand = new Random();
                int  n = rand.nextInt(3) + 1;
                if(n == 1){
                    System.out.printf("you travel down the road for what seems like hours.");
                } else if(n == 2) {
                    System.out.printf("It's your lucky day! On your way down the road you find a satchel %n carrying 20 gold pieces.");
                    gold = 20;
                } else if(n ==3) {
                    System.out.printf(" you are ambushed by two small %n creatures that look %n like rats ");
                    Random rand1 = new Random();
                    int  n1 = rand1.nextInt(2) + 1;
                    if(n1 == 1) {
                        System.out.println("You feel a sharp pain as an arrow flies through your left shoulder!");
                    } else if(n1 == 2){
                        System.out.println("An arrow flies past your head!");
                    } else {
                        System.out.println("You see one of the creatures draw his bow back and point it at you!");
                    }
                    System.out.printf("What would you like to do?(fight = f/run = r)");
                    fightFlight1 = input.next();
                    if(fightFlight1.equals("f")) {
                        System.out.println("You draw your " + weapon + " and strike the first charging creature. The second one %n seeing the power from that blow turns around and scurries away.");
                    } else if(fightFlight1.equals("r")) {
                        System.out.println("You run and run and eventually evade the tiny rat-like creatures. %n and you carry on");
                    } else {
                        System.out.println("Another arrows flies straight into %n your chest and you start to feel yourself fade... ");
                    }
                } else {
                    System.out.printf("As you travel down the road you see a man lying there in front of you.");
                }

                }
                System.out.printf("%n You finally arrive at the mouth of a cave with a sign that crudely reads %n Abandon all hope, ye who enter here!");
                System.out.printf("%n This is the place the old man told you about. Are you ready to enter?(y/n)");
                ready = input.next();
                if(ready.equals("y")){
                    System.out.printf("You enter the cave and prepare yourself %n " +
                            "for whatever lies inside.");
                    System.out.println("Gold : " + gold + " " + "Hp : " + hp);
                } else {
                    System.out.printf("As you are waiting to enter, you are killed by a drifter and %n all your gear is stolen.");
                }
            System.out.println("------CHAPTER 2--------");
        } else {
            System.out.print("Don't waste my time anymore");
        }


        }

}
