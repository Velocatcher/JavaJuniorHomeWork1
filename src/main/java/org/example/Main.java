package org.example;

import java.util.Arrays;
import java.util.List;
/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
*/

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .filter(num -> num % 2 == 0) // фильтруем только четные числа
                .mapToDouble(Integer::doubleValue) // преобразуем Integer в double
                .average() // вычисляем среднее значение
                .orElse(0); // возвращаем 0, если список пуст

        System.out.println("Среднее значение всех четных чисел: " + average);
    }
}
