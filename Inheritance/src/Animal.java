//Example of Inheritance in Java
//        It’s quite simple to achieve inheritance as an OOP concept in Java. Inheritance can be as easy as using the extends keyword:
public class Animal {

    private String reproduce;
    private String animalType;
    private String animalHome;

    public Animal() {
        this.reproduce = reproduce;
        this.animalType = animalType;
        this.animalHome = animalHome;
    }

    public String getReproduce() {
        return reproduce;
    }

    public void setReproduce(String reproduce) {
        this.reproduce = reproduce;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalHome() {
        return animalHome;
    }

    public void setAnimalHome(String animalHome) {
        this.animalHome = animalHome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reproduce='" + reproduce + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalHome='" + animalHome + '\'' +
                '}';
    }
}

class Dog extends Animal{

    private String animalSound;
    public Dog(String reproduce, String animalType, String animalHome, String animalSound) {
        super();
        this.animalSound = animalSound;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public static void main(String[] args) {

    Dog germanShephard = new Dog("give birth","mammal","land animal","barks");

        System.out.println(germanShephard.getAnimalSound());
    }


}
