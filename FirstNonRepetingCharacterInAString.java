import java.util.HashMap;
public class FirstNonRepetingCharacterInAString {
    public static void main(String[] args) {
        String s = "newtonschool";
        int n=s.length();
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(m.containsKey(ch)==true){
                int fre=m.get(ch);
                m.put(ch,fre+1);
            }else{
                m.put(ch,1);
            }

        }
        int index=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(m.get(ch)==1){
                index =i;
                break;
            }
        }
        System.out.println(index);
    }
}
