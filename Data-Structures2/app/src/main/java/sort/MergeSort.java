package sort;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int mid = n/2;
        int[] lArr = new int[mid];
        int[] rArr = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            lArr[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            rArr[i - mid] = arr[i];
        }
        mergeSort(lArr);
        mergeSort(rArr);
        merge(arr, lArr, rArr, mid, n - mid);

    }

    private static void merge(int[] arr, int[] lArr, int[] rArr, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (lArr[i] <= rArr[j]) {
                arr[k++] = lArr[i++];
            }
            else {
                arr[k++] = rArr[j++];
            }
        }
        while (i < left) {
            arr[k++] = lArr[i++];
        }
        while (j < right) {
            arr[k++] = rArr[j++];
        }
    }

}