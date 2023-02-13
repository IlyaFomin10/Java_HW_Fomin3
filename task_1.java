//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Arrays;

public class task_1 {
    static public void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 11, 24, 1, 10, 7, 9, 2, 3));
        int i = 0;
        while(i<numbers.size())
            {
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                }
                else i++;
            }
            System.out.println(numbers);    
            
    }
}
