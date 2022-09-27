import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class printDuplicateCharecter {
    public static void main(String[] args) {
        printDuplicateCharacters("Tannu");
    }
    static void printDuplicateCharacters(String str){
    if(str==null){
        System.out.println("Null String");
        return;
    }

   if(str.length()==1){
       System.out.println("Single Char String");
       return;
           }
   if(str.isEmpty()){
       System.out.println("String is Empty");
       return;
   }
   char words[]=str.toCharArray();//Tannu
    HashMap<Character,Integer>hm=new HashMap<>();
    for(Character ch:words){
        if(hm.containsKey(ch)) {
            hm.put(ch, hm.get(ch) + 1);
        }
        else {
            hm.put(ch, 1);
        }
        }
// print the map
    Set<Map.Entry<Character,Integer>>entrySet=hm.entrySet();
    for(Map.Entry<Character,Integer>entry:entrySet){
        if(entry.getValue()>1){
        System.out.println(entry.getKey()+":"+entry.getValue());

    }

        }
    }

   }
