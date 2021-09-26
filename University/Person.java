package pl.test.OOP.University;

public class Person {
    private String name;
    private int age;

    public void introducte() {
        System.out.println("Introduced from Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
