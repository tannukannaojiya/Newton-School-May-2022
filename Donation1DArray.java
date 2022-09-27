import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Donation1DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
        if(maxi<arr[i]){
            maxi=arr[i];
        }
            int diff=maxi-arr[i];
        sum=sum+diff+arr[i];
            System.out.println(diff+" ");
        }
        System.out.println();
        System.out.println(sum+" ");

    }

}
