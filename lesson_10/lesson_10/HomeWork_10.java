import java.util.Arrays;
import java.util.Random;

public class HomeWork_10 {
    public static void main(String[] args) {
        /*
        Task 0
       Заполните массив 20 случайными целыми числами.
       Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
         */
        Random random = new Random();
        int array[] = new int[20];
        int i;
        int summ = 0;

        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        int counter = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                System.out.println("Четное число: " + array[i]);
                counter++;
                summ += array[i];
            }
        }
        System.out.println("Количество четных чисел: " + counter);
        System.out.println("сумма четных чисел: " + summ);


    }
}
