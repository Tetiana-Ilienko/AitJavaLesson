package lesson_20;

import java.util.Arrays;

public class MainRA {
    public static void main(String[] args) {
        RubberArray rubberArray = new RubberArray();

        rubberArray.add(10, 11, 15);

        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());

        rubberArray.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());
        System.out.println(Arrays.toString(rubberArray.toArray()));
        System.out.println(RubberArray.MULTIPLIER);

        System.out.println("=================");
        System.out.println();
        rubberArray.printFullArray();
        rubberArray.deleteByIndex(2);
        rubberArray.printArray();
        rubberArray.printFullArray();

        System.out.println(rubberArray.getValueByIndex(15));

        rubberArray.changeValueByIndex(1, 100);
        rubberArray.printFullArray();
        System.out.println(rubberArray.max());
        System.out.println(rubberArray.min());
        System.out.println(rubberArray.sumOfValues());


    }

}
