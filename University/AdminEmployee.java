package pl.test.OOP.University;

public class AdminEmployee extends UniversityEmployee {

    private String coffeeType;
    private String officeHoursStudentsNeverHaveTimeFor;


    public void coffeeWithOtherDeansOfficeLadies(){
        System.out.println("Dziekanat nieczynny kiedy jest najbardziej potrzebny");
    }

    public void beUnpolite(String deadline){
        System.out.printf("Indext mozna było zdawac tylko do %s %n", deadline);
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public String getOfficeHoursStudentsNeverHaveTimeFor() {
        return officeHoursStudentsNeverHaveTimeFor;
    }

    public void setOfficeHoursStudentsNeverHaveTimeFor(String officeHoursStudentsNeverHaveTimeFor) {
        this.officeHoursStudentsNeverHaveTimeFor = officeHoursStudentsNeverHaveTimeFor;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }
}
