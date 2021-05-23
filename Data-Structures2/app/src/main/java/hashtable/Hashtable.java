//package hashtable;
//
//public class Hashtable<T> {
//    Entry [] arrayHash;
//    int size;
//
//    public Hashtable(int size) {
//        this.size = size;
//        arrayHash = new Entry[this.size];
//        for (int i = 0; i <arrayHash.length ; i++) {
//            arrayHash[i]= new Entry<T;
//        }
//    }
//
//    int getHash(int key){
//        return key%size;
//    }
//
//    public void add(int key, T value){
//        int index = getHash(key);
//        Entry arrayValue = arrayHash[index];
//        Entry newItem = new Entry<T>(key, value);
//        newItem.next = arrayValue.next;
//        arrayValue.next = newItem;
//    }
//}
