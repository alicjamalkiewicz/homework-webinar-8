package pl.test.OOP.University;

public class Student extends Person {
    private String department;

    public void goForClass() {

    }

    public void goForBeer() {

    }

    @Override
    public void introducte() {
        System.out.println("Introducte from Student");
        super.introducte(); // super - wywołanie z klasy bazowej
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
