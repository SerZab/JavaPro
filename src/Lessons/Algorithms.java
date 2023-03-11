public class Algorithms {
    public static void main(String[] args) {

        int[][] arr = new int[8][8];
        fillSpiral(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int[] myArray = {-12, 1, 5, 2, 7, 3, -11, 4, 9, 11, -6, 111, 0, 42, 121, 54, -4};
        System.out.println("Массив myArray: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        int maxNumber = findMax(myArray);
        System.out.println("Наибольшее число в массиве: " + maxNumber);

        int minNumber = findMin(myArray);
        System.out.println("Наименьшее число в массиве: " + minNumber);

        bubbleSort(myArray);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        int findSum = findSum(myArray);
        System.out.println("Сумма чисел массива: " + findSum);

    }
    public static void fillSpiral(int[][] arr) {
        int value = 1; // начальное значение
        int n = arr.length;
        int m = arr[0].length;
        int row = 0, col = 0; // координаты текущей ячейки

        // заполняем массив по спирали
        for (int k = 0; k < Math.min(m, n) / 2; k++) {
            // заполняем верхнюю сторону спирали
            for (int i = col; i < m - col - 1; i++) {
                arr[row][i] = value++;
            }

            // заполняем правую сторону спирали
            for (int i = row; i < n - row - 1; i++) {
                arr[i][m - col - 1] = value++;
            }

            // заполняем нижнюю сторону спирали
            for (int i = m - col - 1; i > col; i--) {
                arr[n - row - 1][i] = value++;
            }

            // заполняем левую сторону спирали
            for (int i = n - row - 1; i > row; i--) {
                arr[i][col] = value++;
            }

            // переходим к следующей внутренней спирали
            row++;
            col++;
        }

        // если размеры массива нечетные, заполняем центральную ячейку
        if (n % 2 == 1 && m % 2 == 1) {
            arr[n / 2][m / 2] = value;
        }
    }


    public static int findMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static int findMin(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами элементы
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}