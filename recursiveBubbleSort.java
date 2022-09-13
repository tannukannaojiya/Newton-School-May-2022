package com.company.Newton_School.DSA1.Sorting.BubbleSort;
import java.util.Arrays;
public class recursiveBubbleSort {
    public static void usingBubbleSort(int arr[],int n){
        if(n==1)
           return;
        int count=0; // every recursion call it set to 0
        for(int i=0;i<n-1;i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count + 1;
            }
        }
        if (count == 0)
            return;
            usingBubbleSort(arr,n-1); // decreasing n as last element placed

    }
    public static void main(String[] args) {
        int arr[]= {10, 20, -1, -5, 7};
        int n=arr.length;
        usingBubbleSort( arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
// Arrays.toString-->Returns a string representation of the contents of the specified array.
// The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”).
// Adjacent elements are separated by the characters “, ” (a comma followed by a space). Returns “null” if a is null.