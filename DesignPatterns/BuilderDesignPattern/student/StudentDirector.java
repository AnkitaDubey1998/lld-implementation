package DesignPatterns.BuilderDesignPattern.student;

public class StudentDirector {

    StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1)
                .setName("AD")
                .setFatherName("AK")
                .setSubjects()
                .build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2)
                .setName("KD")
                .setAge(25)
                .setFatherName("RD")
                .setMotherName("SD")
                .setSubjects()
                .build();
    }

}
