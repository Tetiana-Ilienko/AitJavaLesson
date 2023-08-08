import java.util.Arrays;
import java.util.Random;

public class MetodsTraning {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeArray(5, 100)));
    }
    /* Task 1
        Написать метод, возвращающий массив целых чисел, заданной длинны.
        Массив должен быть заполнен случайными числами.
         - Перегрузкаю диапазон случайных чисел, может быть задан вторым аргументом вызова метода
         */
    /*
    в этом случае сначала лучше написать метод для перегрузки. Он более развернутый. И первый случай
    будет его частным значением
     */

    public static int[] makeArray(int length) {
        int bound = 100;                          // данная строчка делает программу гибче,
                                                  // если надо поменять размер массива
        return makeArray(length,bound);
    }

    public static int[] makeArray(int length, int bound) {
        if (length < 0 || bound <= 0) return new int[]{}; // проверяем некорректность входящих значений
        Random random = new Random();
        int[] array = new int[length];                     // создаем массив
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(bound);             // заполняем рандомно числа
        }
        return array;

    }

}
