package sort;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testQuickSort(){
        int[] actual1 = { 5, 1, 6, 2, 3, 4 };
        int lenActual1 = actual1.length;
        int[] expected1 = { 1, 2, 3, 4, 5, 6 };

        QuickSort.quickSort(actual1,0, lenActual1-1);
        Assert.assertArrayEquals(expected1, actual1);

        int[] actual2 = { 20,18,12,8,5,-2 };
        int lenActual2 = actual2.length;
        int[] expected2 = { -2,5,8,12,18,20 };
        QuickSort.quickSort(actual2,0, lenActual2-1);
        Assert.assertArrayEquals(expected2, actual2);

        int[] actual3 = { 5,12,7,5,5,7 };
        int lenActual3 = actual3.length;
        int[] expected3 = { 5,5,5,7,7,12 };
        QuickSort.quickSort(actual3, 0 , lenActual3-1);
        Assert.assertArrayEquals(expected3, actual3);


        int[] actual4 = { 2,3,7,13,11 };
        int lenActual4 = actual4.length;
        int[] expected4 = { 2,3,7,11,13 };
        QuickSort.quickSort(actual4,0,lenActual4-1);
        Assert.assertArrayEquals(expected4, actual4);


        int[] actual5 = { 2 };
        int lenActual5 = actual5.length;
        int[] expected5 = { 2 };
        QuickSort.quickSort(actual5,0,lenActual5-1);
        Assert.assertArrayEquals(expected5, actual5);
    }
}
