package pl.test.OOP.University;

public class UniversityEmployee extends Person {

    private String responsibilities;
    private int wages;

    public int payTaxes(){
        return (int) (wages - (wages*0.23));

    }

    public void goToWork(){
        System.out.println("You have to work till the day you die");
    }


    public String getResponsibilities() {
        return responsibilities;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }
}
