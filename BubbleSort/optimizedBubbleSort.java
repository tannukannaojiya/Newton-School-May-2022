package com.company.Newton_School.DSA1.Sorting.BubbleSort;

public class optimizedBubbleSort {
    public static void optimizeBubbleSort(int arr[],int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, -1, -5, 7};
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped =false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
        optimizeBubbleSort( arr,n);
    }
}
