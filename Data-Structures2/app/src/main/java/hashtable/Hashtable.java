package hashtable;

import java.util.LinkedList;

public class Hashtable {
    LinkedList<Entry> [] hashTableArray = new LinkedList[100];

    // add: takes in both the key and value. This method should hash the key, and add the key and value pair
    // to the table, handling collisions as needed.
    public boolean add(String key, String value){
        // takes a key and turns it into a hashed thing
        int arrIndex = hash(key);

        Entry entry = new Entry(key, value);

        if (hashTableArray[arrIndex] == null){
            hashTableArray[arrIndex] = new LinkedList<>();
        }
        if(contains(key)) {
            return false;  // the key is already in use, so don't use it.
        } else {
            hashTableArray[arrIndex].add(entry); // add the key and value pair to the linked list.
        }
        return true;
    }


    // get: takes in the key and returns the value from the table.
    public String get (String key) {
        // String gets hashed to become hashed key, which is the index to find the linked list
        int arrIndex = hash(key);

        if (hashTableArray[arrIndex] == null) {
            hashTableArray[arrIndex] = new LinkedList<>();
        }
        for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
            // if at i the key in the hashtable is the same as the key that is supplied, return the value
            if (hashTableArray[arrIndex].get(i).key.equals(key)){
                return hashTableArray[arrIndex].get(i).value;
            }
        }
        return null;
    }


    // contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains (String key) {
        int arrIndex = hash(key);

        if (hashTableArray[arrIndex] == null) {
            hashTableArray[arrIndex] = new LinkedList<>();
        }

        for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
            if (hashTableArray[arrIndex].get(i).key.equals(key)){
                return true; // returns true when a key already exists
            }
        }
        return false; // returns false when a key does not yet exist
    }
    int hash(String key){
        int len = key.length();
        int addedASCII = 0;
        for (int i = 0; i <len ; i++) {
            char character = key.charAt(i);
            int ascii = (int)character;
            addedASCII += ascii;
        }
        return addedASCII * 599 % hashTableArray.length;
    }


}
