package sort;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class InsertionSortTest {
    @Test public void getInsertionSort(){
        InsertionSort insertionSortIns = new InsertionSort();
        int [] arr = {8,2,6,1,3,4,5,6};
        int [] expectedArr = {1,2,3,4,5,6,6,8};
        insertionSortIns.insertionSort(arr);

        Assert.assertArrayEquals("the two arrays are equal after sorting", expectedArr,insertionSortIns.insertionSort(arr));

    }

    @Test
    public void testInsertionSort2() {
        int[] input = {6};
        InsertionSort.insertionSort(input);
        int[] expected = {6};
        Assert.assertArrayEquals("the two arrays are equal", expected, input);
    }

    @Test
    public void testInsertionSort3() {
        int[] input = {6, 6, 4, 4, 4};
        InsertionSort.insertionSort(input);
        int[] expected = {4, 4, 4, 6, 6};
        Assert.assertArrayEquals("the two arrays are equal after sorting", expected, input);
    }
}
