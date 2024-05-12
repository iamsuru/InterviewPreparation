


/*
    Sorting -: Arrangement of elements in an order(Ascending or Descending).
    Bubble Sort -: It is a comparison based sorting algorithm in which each element is compared with the next element, and is swapped if those elements are not in the correct order.

    Time Complexity - O(n^2)
    Best Case - O(n)
    Worst Case - O(n^2)
    Space Complexity - O(1)
 */

import java.util.Arrays;
class BubbleSort {
    static void bubbleSort(int[] nums) {
        int n = nums.length;
        //for making optimization just use this
        boolean isSwapped = false; 
        for (int i = 0; i < n - 1; i++) {
            /*
                track for each element to place in his right place
                (n-1) means that the correct element is in the right position
             */
            for (int j = 0; j < n - 1 - i; j++) { 
                /*
                    used for perform swapping if not in order
                    (n-i-1) means that the space is already sorted
                 */
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true; // if true it means that all element is not in right position so best case will not work here
                }
            }
            if(!isSwapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,3,9,4,26,68,21,9};
        System.out.println("Unsorted : " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));
    }
}


  

/*
    Selection Sort -: It is a technique where an array is sequentially sorted by placing the smallest from the array one after the other in multiple iterations.

    Time Complexity - O(n^2) 
    Best Case - O(n^2)
    Worst Case - O(n^2)
    Space Complexity - O(1)
 */


class SelectionSort{
    static void selectionSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int smallest = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[smallest]>nums[j])
                    smallest = j;
            }
            System.out.println(Arrays.toString(nums));
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
            System.out.println(Arrays.toString(nums));
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,3,9,4,26,68,21,9};
        System.out.println("Unsorted : " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));
    }
}




















/*
    Insertion Sort -: It is a simple sorting algorithm that builds the final sorted array one item at a time.
        It works continually inserting element from an unsorted sub array into a sorted array.
    
    Time Complexity - O(n^2) 
    Best Case - O(n)
    Worst Case - O(n^2)
    Space Complexity - O(1)
 */


class InsertionSort{
    static void insertionSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int current = nums[i];
            int j = i-1;
            while(j>=0 && current<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,3,9,4,26,68,21,9};
        System.out.println("Unsorted : " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));
    }
}





















/*
    Quick Sort -: Quick sort is a highly efficient and widely used sorting algorithm based on the divide-and-conquer paradigm. It works by selecting a "pivot" element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted independently.

    Time Complexity - O(nlogn) 
    Best Case - O(nlogn)
    Worst Case - O(n^2)
    Space Complexity - O(1)
 */

class QuickSort{
    static void quickSort(int[] nums, int s,int e){
        if(s<e){
            int pivot = partition(nums,s,e);
            //sorting left part
            quickSort(nums, s, pivot-1);
            //sorting right part
            quickSort(nums, pivot+1, e);
        }
    }

    static int partition(int[] nums, int s, int e) {
        int pivot = nums[s];
        int count = 0;

        for(int i = s+1;i<=e;i++){
            if(nums[i] <= pivot)
                count++;
        }

        //placing pivot at right index
        int pivotIndex = s+count;
        swap(nums, pivotIndex, s);

        //sorting left and right part according to the pivot element i.e left part will contain element small than pivot and right part contain big than pivot 
        int i = s,j=e;
        while(i < pivotIndex && j > pivotIndex){
            while(nums[i]<pivot){
                i++;
            }
            while(nums[j]>pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(nums, i++, j--);
            }
        }
        return pivotIndex;
    }



    
    //optimized
    static int partition(int[] nums, int s, int e) {
        int pivot = nums[s];
        int i = s + 1; // index to traverse the array

        for (int j = s + 1; j <= e; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, s, i - 1); // Place the pivot element at its correct position
        return i - 1; // Return the index of the pivot element
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,9,4,26,68,21,9};
        System.out.println("Unsorted : " + Arrays.toString(nums));
        quickSort(nums,0,nums.length-1);
        System.out.println("Sorted : " + Arrays.toString(nums));
    }
}