package ArrayShift;

public class ArrayShift {

    public static int [] insertShiftArray(int[] arr , int value) {
        int arrLength = arr.length; 
        int [] newArr = new int [arrLength+1];  // Creating new Array
        for (int i = 0; i < newArr.length; i++) {
            if(i == (newArr.length/2)){

                newArr[i]=value;
            }else if(i > (newArr.length/2)-1){
                newArr[i]=arr[i-1];
            
            }else{
                newArr[i]=arr[i];
                
            }
        }
        
        for (int i = 0; i < newArr.length; i++) // for loop to print the array
            System.out.print(newArr[i] + " ");
        
      return newArr;

    }

    public static void main(String[] args) {

        int[] arr1 = { 4,8,15,23,42 };

        // System.out.println(reverseArray(arr1));
        insertShiftArray(arr1, 16);
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
