package pl.test.OOP;

import pl.test.OOP.University.AdminEmployee;
import pl.test.OOP.University.Person;
import pl.test.OOP.University.Profesor;
import pl.test.OOP.University.Student;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Burek");
        System.out.println(animal.getName());

        Animal cat = new Animal("Filemon");
        cat.setName("Miauczek");
        System.out.println(cat.getName());

        animal.useVoice();
        cat.useVoice();

        System.out.println("---------------");

        Person person = new Person();
        person.introducte();

        Profesor profesor = new Profesor();
        profesor.introducte();

        System.out.println("----------");

        Student student = new Student();
        student.introducte();

        System.out.println("-------HOMEWORK--------");
        System.out.println("Pani z dziekanatu");

        AdminEmployee deansOfficeLady = new AdminEmployee();
        deansOfficeLady.introducte();
        deansOfficeLady.setName("Pani Bożenka");
        deansOfficeLady.setAge(43);
        deansOfficeLady.setCoffeeType("pażoncha z cukrem i śmietanką");
        deansOfficeLady.beUnpolite("23 lipca");
        deansOfficeLady.setResponsibilities("przyjmowanie indexów, prac magisterskich, etc");
        deansOfficeLady.setWages(6000);
        System.out.println(deansOfficeLady.payTaxes());
        System.out.println(deansOfficeLady.getName());
        System.out.println(deansOfficeLady.getAge());
        System.out.println(deansOfficeLady.getResponsibilities());
        System.out.println(deansOfficeLady.getWages());
        deansOfficeLady.goToWork();

        System.out.println("Pan profesor");

        Profesor panProfesor = new Profesor();
        panProfesor.introducte();
        panProfesor.setName("Nowak");
        panProfesor.setAge(78);
        panProfesor.setResponsibilities("przygotowywanie wykładów, sprawdzanie prac, przeprowadzanie egzaminów");
        panProfesor.setWages(7000);
        panProfesor.setGrade("Associate");
        panProfesor.goToWork();
        System.out.println(panProfesor.getName());
        System.out.println(panProfesor.getAge());
        System.out.println(panProfesor.getResponsibilities());
        System.out.println(panProfesor.getWages());
        System.out.println(panProfesor.getGrade());
        System.out.println(panProfesor.payTaxes());



    }

}
