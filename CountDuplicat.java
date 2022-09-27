import java.util.Scanner;
import java.util.HashMap;
public class CountDuplicat {
    public static void main(String[] args) {
       // 6 1-n k
       //i/p- 1 3 1 3 2 4
       // o/p-1 2


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            if(hm.containsKey(key)){
                int freq=hm.get(key);
                hm.put(key,freq+1);
            }
            else{
                hm.put(key,1);
            }
        }
        for(int key:hm.keySet()){
            int value=hm.get(key);
            if(value>1){
                System.out.println(key+" "+value);
            }
        }
    }
}
