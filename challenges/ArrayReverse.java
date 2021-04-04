
public class ArrayReverse {

    public static int reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        // System.out.println(arr);
        return arr[0];
    }

    public static void main(String[] args) {

        System.out.println("jsahd");
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(reverseArray(arr1));
    }

}
