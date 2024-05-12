
/*
    Linear Search -: It is a sequential search algorithm. In this type of searching, we will have to traverse the array comparing the elements consecutively one after the other. Until the target value is found. It is only suitable to search for elements in a small & unsorted list of elements.

    Time Complexity - O(n)
    Best Case - O(1)
    Worst Case - O(n)
    Space Complexity - O(1)
 */

class LinearSearch {
    static int linearSearch(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5,9,1,8,3,6,7,0};
        int val = 3;
        int res = linearSearch(nums, val);
        if(res != -1)
            System.out.printf("Element %d found at index : %d",val,res);
        else
            System.out.printf("Element %d not found",val);
    }
}





















/* 
    Binary Search -: It is a sorting technique that is based upon the divide and conquer rule.
        In this technique, firstly we find the mid of the array and compare the given value and the mid value of array. If the match is found, the index of the mid element is returned otherwise check that if the given value is less as compared to the mid value of array, will continue searching in the left part of the mid, and if the given value is big as compared to the mid value of array, will continue searching in the right part of the mid, by repeating the procedure.

        Time Complexity - O(logN)
        Best Case - O(1)
        Worst Case - O(logN)
        Space Complexity - O(1)
*/

class BinarySearch{
    static int binarySearch(int[] nums, int left, int right, int val){
        //using recursion
        if(right>left){
            int mid = left + (right-left)/2; //using this trick for finding mid will make us safe by finding mid in the Integer range.
            if(nums[mid]==val)
                return mid;
            if(val<nums[mid])
                return binarySearch(nums, left, mid-1, val);
            else
                return binarySearch(nums, mid+1, right, val);
        }
        else
            return -1;

        //using loop
        // while(right>left){
        //     int mid = left + (right-left)/2;
        //     if(nums[mid]==val)
        //         return mid;
        //     if(val<nums[mid])
        //         right = mid-1;
        //     else
        //         left = mid+1;
        // }
        // return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int val = 2;
        int res = binarySearch(nums, 0, nums.length, val);
        if(res != -1)
            System.out.printf("Element %d found at index : %d",val,res);
        else
            System.out.printf("Element %d not found",val);
    }
}