import java.sql.Array;
import java.util.Arrays;
// Lesson_09
public class LessonMassiv {
    /*
    Массив — это структура данных, в которой хранятся элементы одного типа. Его можно представить,
    как набор пронумерованных ячеек, в каждую из которых можно поместить какие-то данные (один элемент данных в одну
    ячейку). Доступ к конкретной ячейке осуществляется через её номер. Номер элемента в массиве также называют индексом.

     В случае с Java массив однороден, то есть во всех его ячейках будут храниться элементы одного типа. Так, массив
     целых чисел содержит только целые числа (например, типа int), массив строк — только строки, массив из элементов
     созданного нами класса Dog будет содержать только объекты Dog. То есть в Java мы не можем поместить в первую ячейку
     массива целое число, во вторую String, а в третью — “собаку”.

     **Как объявить массив?**
     Как и любую переменную, массив в Java нужно объявить. Сделать это можно одним из двух способов. Они равноправны,
     но первый из них лучше соответствует стилю Java.

               dataType[] arrayName;    ->     int[] myArray;
               dataType arrayName[];    ->     int myArray[];
     Как и любой другой объект, создать массив Java, то есть зарезервировать под него место в памяти, можно с помощью
     оператора new.


     Делается это так:

               new arrayType [length];
               arrayType — это тип массива, а length — его длина (то есть, количество ячеек),
               выраженная в целых числах (int)

               int[] myArray; // объявление массива
               myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

      Однако гораздо чаще массив создают сразу после объявления с помощью такого сокращённого синтаксиса:

               int[] myArray = new int[10]; // объявление и выделение памяти в одной строке кода

      При подобной инициализации все элементы массива имеют значение по умолчанию.
      Для числовых типов (в том числе для типа char) это число 0, для типа boolean это значение false,
      а для остальных объектов это значение null.

      Однако также можно задать конкретные значения для элементов массива при его создании:

               int[] numbers = new int[] { 1, 2, 3, 5 };
               String[] strings = { “One”, “Two”, “Twenty five” };

      Обращение к элементу массива происходит по его индексу:
               myArray[0];

      Важнейшее свойство, которым обладают массивы, является свойство(метод) length, возвращающее длину массива,
      то есть количество его элементов:

               int[] numbers = {1, 2, 3, 4, 5};
               int length = numbers.length;   // 5

    ВАЖНО! - изменить длину массива после его создания нельзя.
    В массивах, как и везде в Java, элементы нумеруются с нуля.
      Для работы с массивами в Java есть класс java.util.Arrays*/

    /**Заполнение массива случайными данными:
     double a = Math.random();
     - генерирует случайное число в интервале от [0, 1) - скобки из математики [ => 0 - может быть, ) => 1 - не может быть

     double x = (Math.random() * (b-a) ) + a
     - генерирует случайное число в интервале от [a, b) (a<b) a - может быть, b - не может быть

     int n = (int)(Math.random() * (b - a + 1) + a)
     - генерирует случайное целое число в интервале [a, b] a - может быть, b - может быть */




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
