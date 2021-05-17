# Sorting Algorithms:

## Insertion Sort
Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

The primary advantage of insertion sort over selection sort is that selection sort must always scan all remaining elements to find the absolute smallest element in the unsorted portion of the list, while insertion sort requires only a single comparison when the (k + 1)-st element is greater than the k-th element.

It does not have good time complexity of big o of n. It is O(n^2). This is because in the worst case scenario, you have to swap and compare every single item if the array starts in decreasing order. For smaller sets of data, however, perhaps less than 1000 items, it can be fairly fast.

### Learning Objectives
* Understand what a storted list does, what it is not good at, and how it sorts a list.

### Information Flow

* Array is sorted in place
  * Items are rearranged within the array
* We start from the second item
  * An array with only one item is a sorted list. 
* If the item at index i (called a key) is smaller than the value of the item at index j, then the key moves one position to the left ([Baeldung](https://www.baeldung.com/java-insertion-sort))
  

### Diagram
From [Geeks for Geeks](https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwiU0NHk6K7lAhXuHTQIHXBWDKoQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.geeksforgeeks.org%2Finsertion-sort%2F&psig=AOvVaw1nYanfQCDzyfBPIShuHQCc&ust=1571797675549321)
![insertion sort](/code401Challenges/assets/insertionsort.png)

### Algorithm

1. Work left to right
2. Examine each item and compare that item to items on its left.
3. Insert the item in the correct position in the array, given the item's value.

### Pseudocode
````
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
````

