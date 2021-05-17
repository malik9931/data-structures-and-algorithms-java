public class InsertionSort{
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];

            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int [] arr = {8,2,6,1,3,4,5,6};
        insertionSort(arr);
        for (int s:arr) {
            System.out.print(s);
        }
        
    }

}