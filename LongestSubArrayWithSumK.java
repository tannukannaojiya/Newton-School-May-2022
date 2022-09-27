import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.HashMap;
public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        // 6 15 n k
        //i/p-10 5 2 7 1 9

        //o/p-4

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int maxiLen=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if (sum == k) maxiLen = i + 1;
            int diff=sum-k;
            if(hm.containsKey(diff)){
                int idx=hm.get(diff);
                int len=i-idx;
                maxiLen=Math.max(len,maxiLen);
            }

        if(hm.containsKey(sum)==false) {
            hm.put(sum, i);
        }
        }
        System.out.println(maxiLen);
    }
}
