public class mockExam {
    //[[4,1,5],[6,2],[1,3,4]]
    public static void main(String[] args) {
        int arr1[] = {4, 1, 5};
        int arr2[] = {6, 2};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int ans[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        for(i=0;i<n1+n2;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
