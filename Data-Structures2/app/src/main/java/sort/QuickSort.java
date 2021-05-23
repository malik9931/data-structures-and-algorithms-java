package sort;


public class QuickSort {
    public static void quickSort(int[] arr, int left,int right){
        if (left<right){
            // Partition the array by setting the position of the pivot value
            int position =  partition(arr, left, right);
            // Sort the left
            quickSort(arr,left, position-1);
            // Sort the right
            quickSort(arr,position+1,right);

        }

    }

    private static int partition(int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        int pivot = arr[right];
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = left-1;

        for (int i = left; i <= right-1; i++) {
            if (arr[i] < pivot){
                low++;
                swap(arr, low, i);
            }
        }
        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right.
        swap(arr, low + 1, right);
        // return the pivot index point
        return (low+1);
    }

    private static void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }


}