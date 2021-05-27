package hashtable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftJoinTest {
    Hashtable hashtable1;
    Hashtable hashtable2;
    @Test
    public void leftJoinTwoHashmaps1() {

        hashtable1 = new Hashtable();
        hashtable1.add("hello", "tkdjs");
        hashtable1.add("people", "kjsa");
        hashtable1.add("car", "sakna");

        hashtable2 = new Hashtable();
        hashtable2.add("hello", "sdl");
        hashtable2.add("people", "dksj");
        hashtable2.add("car", "ks");

        String[] one = {"hello", "tkdjs", "sdl"};
        String[] two = {"people", "kjsa", "dksj"};
        String[] three = {"car", "sakna", "ks"};
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);

        System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
        ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
        for(String[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
