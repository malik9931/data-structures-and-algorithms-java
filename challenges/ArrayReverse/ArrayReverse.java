package ArrayReverse;

public class ArrayReverse {

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temporaryElem = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temporaryElem;
        }
        // System.out.println(arr);

        for (int i = 0; i < arr.length; i++) // for loop to print the array
            System.out.print(arr[i] + " ");

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };

        // System.out.println(reverseArray(arr1));
        reverseArray(arr1);
    }

}
// before reversing: [1, 2, 3, 4, 5 ]
// 1st itr: [5, 2, 3, 4, 1 ]
// 2nd itr: [5, 4, 3, 2, 1 ]
// .
// .
// ALGORITHM reverseArray(arr [0 ... n-1])
// INPUT ← An array on nth length
// OUTPUT ← The same array with reversing its items
// Before reversin: arr1 =  [arr[0] ... arr[n-1] ]
// DECLARE arr1 ← reverseArray(arr1)
// OUTPUT ← reversin: arr =  [arr[n-1] ... arr[0] ]
