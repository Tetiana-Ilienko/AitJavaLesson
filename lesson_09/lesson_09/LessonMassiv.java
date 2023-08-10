import java.sql.Array;
import java.util.Arrays;
// Lesson_09
public class LessonMassiv {
    public static void main(String[] args) {
        int[] array; // объявления массива 1 способ предпочтительнее
        // int array2[];
        array = new int[5]; // инициализация массива
        int a = 10;
        int[] array1 = new int[a]; // 0  объявляем массив через переменную

        char[] chars = new char[5]; // 0 default

        String string = null;
        String[] strings = new String[7]; // null
        boolean[] booleans = new boolean[10]; // false
        String[] string1 = {"One", "Two", " " };

        int[] myArray = new int[]{1, 5, -16, 25, 26}; // явное объявление массина
        int digitIndex1 = myArray[1]; // обращаемся к индексу ячейки
        System.out.println(digitIndex1);
        myArray[1] = 10; //присваеваем ячейке новое значение
        int digitIndexNew1 = myArray[1];
        System.out.println(digitIndexNew1);

        // длинна массива
        int lengthArray = myArray.length;
        System.out.println("Array length" + lengthArray);

        int counter =0;
        while (counter< myArray.length){
            if (myArray[counter] % 2 == 0){            //можно задавать условия
                System.out.println(myArray[counter]);
            }
            System.out.println((myArray[counter])); // последовательные доступ к ячейкам массива
            counter ++;
        }
        // вывод массива на экран
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(string1));









    }
}
