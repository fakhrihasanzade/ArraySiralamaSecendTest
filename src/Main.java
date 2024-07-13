public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 5, 8, 4, 6, 3, 1, 2, 7};

        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // array[j] və array[j + 1] elementlərinin yerlərini dəyiş
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}