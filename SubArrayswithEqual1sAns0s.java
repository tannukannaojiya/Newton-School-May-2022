import java.util.HashMap;
public class SubArrayswithEqual1sAns0s {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1};
        int n=arr.length;
        for(int i=0;i<n;i++) {
            if (arr[i] == 0) arr[i] = -1;
        }
        int sum=0;
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) count++;
            if(hm.containsKey(sum)) {
                int valu = hm.get(sum);
                count = count + valu;
                hm.put(sum, valu + 1);
            }
            else{
                hm.put(sum,1);
            }
        }
        System.out.println(count);
    }
}
