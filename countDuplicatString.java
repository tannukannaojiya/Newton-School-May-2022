import java.util.*;
public class countDuplicatString {
    public static void main(String[] args) {
        String s="tannu annu";
        HashMap<Character,Integer>hm=new HashMap<>();
        char[] charArray=s.toCharArray();
        for(char c:charArray){
            if(hm.containsKey(c)){
                int fre=hm.get(c);
                hm.put(c,fre+1);
            }else{
                hm.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer>es:hm.entrySet()){
            if(es.getValue()>1)
                System.out.println(es.getKey()+" "+es.getValue());
        }
    }
}
