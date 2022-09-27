public class StringBasic {
    public static void main(String[] args) {
        String name = "mnop";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        //System.out.println(sb);
        String result=sb.toString();
        System.out.println(result);




    }
}

