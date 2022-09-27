public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 99, 2, 0, 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printArray(arr);
    }
        public static void printArray(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");

            }
        }

        }




