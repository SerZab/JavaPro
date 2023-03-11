public class MaxMinArr {
    public static void main(String[] args) {
        int[] arr = {0, 5, 10, 15, 20, 25, 35, 65, 120, -4, -125, 211};
        int max = findMax(arr);
        System.out.println("Максимальный элемент в массиве: " + max);

        int min = findMin(arr);
        System.out.println("Минимальный элемент в массиве: " + min);
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // предполагаем, что первый элемент массива - наибольший
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // обновляем значение наибольшего элемента
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0]; // предполагаем, что первый элемент массива - наибольший
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // обновляем значение наибольшего элемента
            }
        }
        return min;
    }
}