package DesignPatterns.BuilderDesignPattern.student;

public class Main {
    public static void main(String[] args) {
        StudentDirector studentDirector = new StudentDirector();

        Student engineeringStudent = studentDirector.createEngineeringStudent(new EngineeringStudentBuilder());
        System.out.println(engineeringStudent.toString());

        Student mbaStudent = studentDirector.createMBAStudent(new MBAStudentBuilder());
        System.out.println(mbaStudent.toString());
    }

}
