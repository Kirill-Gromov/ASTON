package DZ;

public class Lesson_2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumInRange();
        numberSign();
        conclusion();
        printNum();
        years();
        array1();
        array2();
        array3();
        array4();
        len1();
    }
    // 1 задание
    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
        System.out.println("_____________________");
    }
    //2 задание
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("_____________________");
    }
    //3 задание
    public static void printColor() {
        int value = 150; // Задайте любое значение здесь для проверки

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println("_____________________");
    }
    //4 задание
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("_____________________");
    }
    //5 задание
    public static void sumInRange() {
        int num1 = 7;
        int num2 = 8;
        boolean result = checkSumInRange(num1, num2);
        System.out.println("Result: " + result);
        System.out.println("_____________________");
    }
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;

        for (int i = 10; i <= 20; i++) {
            if (sum == i) {
                return true;
            }
        }
        return false;
    }
    //6 задание
    public static void numberSign() {
        checkNumberSign(10);
        checkNumberSign(-5);
        checkNumberSign(0);
        System.out.println("_____________________");
    }

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным.");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }
    //7 задание
    public static void conclusion() {
        System.out.println(isNegative(10));
        System.out.println(isNegative(-5));
        System.out.println(isNegative(0));
        System.out.println("_____________________");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
    //8 задание
    public static void printNum() {
        printStringMultipleTimes("Hello!", 3);
        System.out.println("_____________________");
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
    //9 задание
    public static void years() {
        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " является високосным годом: " + isLeap);
        System.out.println("_____________________");
    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //10 задание
    // Печать исходного массива
    public static void array1() {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Замена 0 на 1, 1 на 0
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else if (array1[i] == 1) {
                array1[i] = 0;
            }
        }

        // Печать измененного массива
        System.out.print("Измененный массив: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("\n_____________________");
    }
    //11 задание
    public static void array2() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        System.out.print("Заполненный массив: ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println("\n_____________________");
    }
    //12 задание
    public static void array3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        // Печать измененного массива
        System.out.print("Измененный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n_____________________");
    }
    //13 задание
    public static void array4() {
        int n = 5; // Размер квадратного массива (n x n)
        int[][] matrix = new int[n][n];

        // Заполнение главной диагонали единицами
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        // Печать массива
        System.out.println("Массив с заполненной главной диагональю:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n_____________________");
    }
    //14 задание
    public static void len1 () {
        int len = 5;
        int initialValue = 7;
        int[] resultArray = createArray(len, initialValue);

        // Печать результата массива
        System.out.println("Одномерный массив:");
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len]; // Создание одномерного массива длиной len

        // Заполнение массива значением initialValue
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array; // Возвращение заполненного массива
    }
}
