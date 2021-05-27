package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;

public class LeftJoin {
    public static ArrayList<String[]> leftJoin(Hashtable map1, Hashtable map2){
        ArrayList<String[]> resultList= new ArrayList<>();
        for (LinkedList<Entry> index: map1.hashTableArray) {

            if (index != null){
                for (Entry entry: index){
                    resultList.add(new String[]{ entry.key , entry.value , map2.contains(entry.key) ? map2.get(entry.key):null});
                }
            }
        }
        return resultList;
    }
}
