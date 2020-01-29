package studentdatabaseapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfo());

        // Ask how many students we want to add

        // Create n number of new students

    }
}
