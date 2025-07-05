package DesignPatterns.BuilderDesignPattern.student;

public class StudentDirector {

    public Student createEngineeringStudent(StudentBuilder studentBuilder) {
        return studentBuilder.setRollNumber(1)
                .setName("AD")
                .setFatherName("AK")
                .setSubjects()
                .build();
    }

    public Student createMBAStudent(StudentBuilder studentBuilder) {
        return studentBuilder.setRollNumber(2)
                .setName("KD")
                .setAge(25)
                .setFatherName("RD")
                .setMotherName("SD")
                .setSubjects()
                .build();
    }

}
