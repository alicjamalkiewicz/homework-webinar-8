package pl.test.OOP.University;

// dziedziczyć można tylko po jednej klasie
public class Profesor extends UniversityEmployee{
    private String grade;

    public void teachStudents() {

    }

    public void makeExam() {

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
