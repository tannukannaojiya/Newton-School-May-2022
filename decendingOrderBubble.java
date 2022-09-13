package com.company.Newton_School.DSA1.Sorting.BubbleSort;

public class decendingOrderBubble {
    public static void descendingBubbleSort(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {10, 20, -1, -5, 7};
        int n=arr.length;
        for(int i=0;i<n-1;i++){ // n-1 times we have to pass (0 to n-2-->n-1 don't be confuse)
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        descendingBubbleSort( arr,n);
    }
}
