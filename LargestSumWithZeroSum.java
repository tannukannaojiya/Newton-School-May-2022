import java.util.HashMap;
public class LargestSumWithZeroSum {
    public static void main(String[] args) {
        int arr[]={15 ,-2, 2, -8 ,1, 7, 10 ,23};   //o/p- 5
        int n=arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0, maxLen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) maxLen=i+1;
            if(hm.containsKey(sum)){
                int idx=hm.get(sum);
                maxLen=Math.max(maxLen,i-idx);
            }else if(hm.containsKey(sum)==false){
                hm.put(sum,i);
            }
            if(maxLen>0){
                System.out.println(maxLen);
            }else{
                System.out.println("-1");
            }
        }

    }
}
