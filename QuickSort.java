public class QuickSort {
    static void swap(int arr[],int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    static int partition(int arr[],int l,int r){
        int pivotVal=arr[r];
        int i=l;
        for(int j=l;j<r;j++){
            if(arr[j]<pivotVal){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,r);
        return i;
    }
    public static void quickSort(int arr[],int l,int r){
        if(l<r){
            int pivotIndex=partition(arr,l,r);
            quickSort(arr,l,pivotIndex-1);
            quickSort(arr,pivotIndex+1,r);
        }
    }

    public static void main(String[] args) {
        int arr[]={27,9,1,8,4,66};
        int n=arr.length;
        for(int num:arr){
            System.out.println(num+" ");
        }
        System.out.println();
        quickSort(arr,0,n-1);
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
