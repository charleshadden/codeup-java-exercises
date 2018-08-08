package util;

import java.util.Scanner;


public class Input {

    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        return scanner.nextLine().toUpperCase().trim();
    }




    public boolean yesNo() {
        String string = getString();
        return string.equals("Y") || string.equals("YES");
    }

    public void getInt(int min, int max) {
        int num;
        do {
            System.out.println("Enter an integer: ");
            num  = getInt();
        } while (!(num >= min && num <= max));

    }
    public int getInt() {
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }

    public void getDouble(double min, double max) {
        double num;
        do {
            System.out.println("Enter a decimal number: ");
            num  = getDouble();
        } while (!(num >= min && num <= max));

    }
    public double getDouble() {
        double i = scanner.nextDouble();
        scanner.nextLine();
        return i;
    }


}
