import java.util.HashMap;
public class countFrequncy {
    public static void main(String[] args) {
        int arr[]={2,3,5,2,6,2,6,8};
        int n=arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int fre=hm.get(arr[i]);
                hm.put(arr[i],fre+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
    }
}
