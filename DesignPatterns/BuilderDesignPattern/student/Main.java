package DesignPatterns.BuilderDesignPattern.student;

public class Main {
    public static void main(String[] args) {
        StudentDirector studentDirector1 = new StudentDirector(new EngineeringStudentBuilder());
        Student engineeringStudent = studentDirector1.createStudent();
        System.out.println(engineeringStudent.toString());

        StudentDirector studentDirector2 = new StudentDirector(new MBAStudentBuilder());
        Student mbaStudent = studentDirector2.createStudent();
        System.out.println(mbaStudent.toString());
    }

}
