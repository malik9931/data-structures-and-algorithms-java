package hashtable;

public class Entry{
    String key;
    String value;


    public Entry(){

    }

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
