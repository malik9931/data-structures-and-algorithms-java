// package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int idenxOfKeyElement = -1;
        int firstElementIndex = 0;
        int lastElementIndex = arr.length - 1;
        int midElementIndex = (firstElementIndex+lastElementIndex)/2;
        while (firstElementIndex<lastElementIndex) {
            if(arr[midElementIndex] < key){
                firstElementIndex = midElementIndex+1;
            }else if(arr[midElementIndex] == key){
                idenxOfKeyElement = midElementIndex;
                break;
            }else{
                lastElementIndex = midElementIndex-1;
            }
            midElementIndex = (firstElementIndex + lastElementIndex)/2;
        }
        
        return idenxOfKeyElement;
    }

    public static void main(String[] args) {
        int [] arr = {4,8,15,16,23,42};
        // int key = 15; // Founded Index
        int key = 77; // Not Founded Index
        

        // System.out.print(binarySearch(arr,key));

        // Testing Part
        testBinarySearch();
        
    }

    public static void testBinarySearch(){
        int []testArr = {11,22,33,44,55,66,77};
        int keyTest = 22;
        int notFoundKeyTest = 88;
        System.out.println("The Expected Found index: "+1+", The Actual index is: "+binarySearch(testArr,keyTest));
        System.out.println("The Expected Unfound index: "+-1+", The Actual index is: "+binarySearch(testArr,notFoundKeyTest));
        

    }
}
