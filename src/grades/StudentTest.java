package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Charles");
        student.addGrade(88);
        student.addGrade(86);
        student.addGrade(50);

        Student student1 = new Student("John");
        student1.addGrade(73);
        student1.addGrade(34);
        student1.addGrade(99);

        System.out.println(student.getName());
        System.out.println(student.grades);
        student.getGradeAverage();
        System.out.println(student1.getName());
        System.out.println(student1.grades);
        student1.getGradeAverage();
    }
}
