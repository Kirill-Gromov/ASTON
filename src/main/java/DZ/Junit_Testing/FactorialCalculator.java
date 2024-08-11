package DZ.Junit_Testing;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа для вычисления факториала
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        // Вызов метода для вычисления факториала
        long factorial = calculateFactorial(number);

        // Вывод результата
        System.out.println("Факториал " + number + " равен " + factorial);
    }

    // Метод для вычисления факториала
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}


