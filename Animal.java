package pl.test.OOP;

public class Animal {
    private String name;

    // konstruktor bezparametrowy
    public Animal() {
        System.out.println("Konstruktor został uruchomiony");
    }

    // konstruktor z parametrem
    public Animal(String name) {
        this.name = name;
    }

    // konstruktor kopiujący
    public Animal(Animal animal) {
        this.name = animal.getName();
    }

    public void useVoice() {
        System.out.println("Każde zwierze wydaje głos");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}