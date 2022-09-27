public class mergeTwoSort {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 7, 9};
        int arr2[] = {2, 3, 5, 7, 9};     //TC:O(nlogn)
        int n1 = arr1.length;              //sc:O(n)
        int n2 = arr2.length;
        int result[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        for ( i = 0; i < n1 + n2; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
