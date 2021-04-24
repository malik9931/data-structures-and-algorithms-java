package utilities;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, Double age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Cat: "+ super.toString();
    }
}
