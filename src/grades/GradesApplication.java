package grades;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        HashMap<String, Student> students = new HashMap<>();

        Student student = new Student("Charles");
        student.addGrade(88);
        student.addGrade(86);
        student.addGrade(93);
        Student student1 = new Student("Tiff");
        student1.addGrade(93);
        student1.addGrade(74);
        student1.addGrade(83);
        Student student2 = new Student("Diesel");
        student2.addGrade(94);
        student2.addGrade(98);
        student2.addGrade(88);
        Student student3 = new Student("Fraulein");
        student3.addGrade(73);
        student3.addGrade(64);
        student3.addGrade(50);

        students.put("charles1989", student);
        students.put("tiff1988", student1);
        students.put("diesel2013", student2);
        students.put("fraulein2017", student3);
        String go;
    do {
        System.out.println("Welcome \n" +
                "Here are the github usernames of our students: \n");

        for (String name : students.keySet()) {
            System.out.print(" |" + name + "| ");
        }

        System.out.println("\n\n What student would you like to see more information on?");
        String response = sc.nextLine();

        if (students.containsKey(response)) {
            System.out.printf("Name: %s Github Username: %s Grades: %s Average: %s%n", students.get(response).getName(), response, students.get(response).grades ,df2.format(students.get(response).getGradeAverage()));


        } else {
            System.out.println("No user with the username of '" + response + "' was found.");
        }

        System.out.println("Would you like to see another student?(y/n)");
        go = sc.nextLine().toLowerCase().trim();

    }while(go.equals("y"));
        System.out.println("Goodbye");
    }
}

