package utilities;

public class Dog extends Animal{
    public Dog(String name, Double age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Dog: "+ super.toString();
    }
}
