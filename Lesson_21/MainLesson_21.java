package Lesson_21;

import java.util.Arrays;

// алгоритм линейного поиска
public class MainLesson_21 {
    public static void main(String[] args) {
        int[] ints = {34, 21, 67, 41, 10, 5, 0, 87, 99, 38, 57, 3, 77};
        System.out.println(ints.length);
        System.out.println(ArrayUtil.linearSearch(ints, 100));
        System.out.println("До сортировки");
        System.out.println(Arrays.toString(ints));

        ArrayUtil.sortSelection(ints);

        System.out.println("После сортировки");
        System.out.println(Arrays.toString(ints));


        int numberForSeach = 21;
         int idx  = ArrayUtil.binarySearch(ints, numberForSeach);
        System.out.println("Индекс числа " + numberForSeach + " = " + idx);



    }





}
