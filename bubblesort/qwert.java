package bubblesort;

public class qwert {
    public static void printArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 23, 6, 7, 65, 43, 22, 23, 67, 8, 76, 988, 344, 765 };
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}