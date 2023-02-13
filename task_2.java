//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 11, 24, 1, 10, 7, 9, 2, 3));
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Minimum is " + numbers.get(0));
        System.out.println("Maximum is " + numbers.get(numbers.size() - 1));
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Average is = " + sum / numbers.size());
    }
}