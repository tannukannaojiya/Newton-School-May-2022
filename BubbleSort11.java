public class BubbleSort11 {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,1,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
