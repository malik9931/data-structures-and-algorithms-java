package hashtable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashtableTest {
    Hashtable testHashtable;

    @Before
    public void getReady() {
        testHashtable = new Hashtable();
        testHashtable.add("key1", "value1");
        testHashtable.add("keyKey", "value2");

    }

    @Test
    public void testHashTable() {

        // Tests that the add method enters a key and value
        Assert.assertTrue("Expected True", testHashtable.add("key3", "value3"));

        // Tests that collision produces a false from add method
        Assert.assertEquals("first key should have value of value1",
                "value1",
                testHashtable.get("key1")
        );

        // Check that contains method can check if a key exists already:
        Entry testEntry = new Entry("hello", "there");
        String testStringKey = "hello";
        Assert.assertTrue("Expected true",
                testEntry.key.contains(testStringKey));


        // Check that hash converts a string to a usable hash
        String toHash = "Elephant";
        Assert.assertEquals("Expected index of 83",
                83,
                testHashtable.hash(toHash)
        );

    }
}
