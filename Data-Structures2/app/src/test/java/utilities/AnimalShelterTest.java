package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test public void testAnimalShelter() throws IllegalAccessException {
        AnimalShelter newTest = new AnimalShelter();
        Cat cat1 = new Cat("BasBoos",2.5,"red");
        Cat cat2 = new Cat("cat2",3.2,"black");
        Dog dog1 = new Dog("dog1",5.5,"blue");

//        System.out.println("dsdds   "+newTest.dequeue("cat"));
        assertEquals("Dequing from empty queue: ","java.lang.NullPointerException",newTest.dequeue("cat").toString());
        assertEquals("before adding, i.e: Shelter is empty: ","AnimalShelter{catQ=NULL, dogQ=NULL}",newTest.toString());
        newTest.enqueue(cat1);
        assertEquals("After adding one Cat: ","AnimalShelter{catQ={ Cat: {name='BasBoos', age=2.5, color='red'} } -> NULL, dogQ=NULL}",newTest.toString());
        newTest.enqueue(cat2);
        assertEquals("After adding two Cats: ","AnimalShelter{catQ={ Cat: {name='BasBoos', age=2.5, color='red'} } -> { Cat: {name='cat2', age=3.2, color='black'} } -> NULL, dogQ=NULL}",newTest.toString());

        newTest.enqueue(dog1);

        assertEquals("After adding two Cats and one dog: ","AnimalShelter{catQ={ Cat: {name='BasBoos', age=2.5, color='red'} } -> { Cat: {name='cat2', age=3.2, color='black'} } -> NULL, dogQ={ Dog: {name='dog1', age=5.5, color='blue'} } -> NULL}",newTest.toString());

    }
}
