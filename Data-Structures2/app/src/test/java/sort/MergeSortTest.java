package sort;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
    @Test
    public void positiveTest() {
        int[] actual1 = { 5, 1, 6, 2, 3, 4 };
        int[] expected1 = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual1);
        Assert.assertArrayEquals(expected1, actual1);


        int[] actual2 = { 20,18,12,8,5,-2 };
        int[] expected2 = { -2,5,8,12,18,20 };
        MergeSort.mergeSort(actual2);
        Assert.assertArrayEquals(expected2, actual2);

        int[] actual3 = { 5,12,7,5,5,7 };
        int[] expected3 = { 5,5,5,7,7,12 };
        MergeSort.mergeSort(actual3);
        Assert.assertArrayEquals(expected3, actual3);


        int[] actual4 = { 2,3,7,13,11 };
        int[] expected4 = { 2,3,7,11,13 };
        MergeSort.mergeSort(actual4);
        Assert.assertArrayEquals(expected4, actual4);

    }
}
