public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8, 2, 1, 9, 4, 6, 0, 1};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            int hole = i;
            int value = arr[i];
            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}


