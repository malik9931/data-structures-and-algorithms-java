package utilities;


import stacksandqueues.Queue;


public class AnimalShelter {
    Queue<Cat> catQ = new Queue<>();
    Queue<Dog> dogQ = new Queue<>();

    public void enqueue(Cat cat){
        catQ.enqueue(cat);
    }
    public void enqueue(Dog dog){
        dogQ.enqueue(dog);
    }

    public Object dequeue (String pref) throws IllegalAccessException {
        if (pref.toLowerCase().equals("cat")){
            if (catQ.isEmpty())
                return new NullPointerException();
            return catQ.dequeue();
        }else if (pref.toLowerCase().equals("dog")){
            if (dogQ.isEmpty())
                return new NullPointerException();
            return dogQ.dequeue();
        }else {
            throw new IllegalAccessException("This shelter only provides dogs and cats");
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catQ=" + catQ +
                ", dogQ=" + dogQ +
                '}';
    }
}
