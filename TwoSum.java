public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};  //o/p-[1 , 2]  tc:O(n)  sc:O(1)
        int target=9;
        int stat=0, end=arr.length-1;
        while(stat<end){
            if(arr[stat]+arr[end]>target){
                end--;
            }
            else if(arr[stat]+arr[end]<target){
                stat++;
            }else{
                stat++;
                end--;
            }
        }
        System.out.println(end+" "+stat);

    }
}
