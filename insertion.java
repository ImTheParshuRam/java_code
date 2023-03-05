public class insertion {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 8, 2 };
        for (int i = 0; i <= arr.length - 1; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                // Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        PrintArray(arr);
    }

}
