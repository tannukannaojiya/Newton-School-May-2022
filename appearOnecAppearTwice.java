public class appearOnecAppearTwice {
    public static void main(String[] args) {
        int arr[]={2,3,8,2,9,3,9,8,1}; //tc:O(n) sc:O(1)
        int n=arr.length;
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=res^arr[i];    // 2^3^8^2^9^3^9^8^1
        }
        System.out.println(res);
    }
}
