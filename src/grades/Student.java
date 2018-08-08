package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade) {
        grades.add(grade);
    }
    // returns the average of the students grades

    public double getGradeAverage() {
        double sum = 0;
        for(int i = 0; i < grades.size(); i++) {

            sum += grades.get(i);
        }
           return sum / (double)grades.size();

    }

}
