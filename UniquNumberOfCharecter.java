import java.util.HashSet;
import java.util.Scanner;
public class UniquNumberOfCharecter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character>hs=new HashSet<>();
        String str=sc.nextLine();
        //i/p-newton school
        //o/p- 10
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        System.out.println(hs.size());

    }
}
