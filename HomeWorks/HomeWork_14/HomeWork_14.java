import java.util.Arrays;

public class HomeWork_14 {
    public static void main(String[] args) {

        // Task_0
        System.out.println(myToUpperCase("mother"));
        System.out.println(myToUpperCase("Mother"));
        System.out.println(myToUpperCase(" I love my Mother!"));
        System.out.println(myToUpperCase(" Я люблю свою маму! "));
        System.out.println("Обработка пустой строки " + myToUpperCase(""));

        // Task_1
        int[] array = {1, 0, 6, 8, -4, 22};
        swapValues(array, 2, -3);
        //int[] array = {};
        System.out.println(Arrays.toString(array));
        String[] strings = {"Banana", "", "Apple", null, "Pear", "Plum", "Peach", " Strawberry", "",};
        swapValues(strings,3,7); // обращаемся к методу, после создания массива
        System.out.println(Arrays.toString(strings)); // распечатываем массив после

        //Task_2
        System.out.println(mySubstringMethod("Абракадабра", 4, 9));
        System.out.println(mySubstringMethod("Абракадабра", 3));


    }

    /*
    Task 0
    Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
     */
    public static String myToUpperCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            // если символ попадает в данный диапазон - выполняется условие (для латиницы и кириллицы)
            if (charArray[i] >= 97 && charArray[i] <= 122 || charArray[i] >= 1072 && charArray[i] <= 1103) {
                charArray[i] = (char) (str.charAt(i) - 32);
            }
        }
        return String.valueOf(charArray);
    }


    /*
    Task 1
    Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
    Метод должен поменять местами значения, хранящихся в этих индексах
    {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
    Если индексы за пределами массива?
     - Перегрузка метода для работы с массивами строк.


     Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
     Метод должен поменять местами значения, хранящихся в этих индексах
     это должен быть void метод. Пришёл массив в метод. В нем нужно просто поменять местами значения в двух "ячейках"
     */
    public static void swapValues(int[] array, int x, int y) {
        if (x >= 0 && y >= 0 && x < array.length && y < array.length) { // условие при котором выполняется замена
            // если индексы не в заданном диапазоне - метод ничего не делает
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
    }


    public static void swapValues(String[] array, int x, int y) {
        if (x > 0 && y > 0 && x < array.length && y < array.length) {
            String temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }

    }

    /*
    Task 2
    Написать метод, принимающий строку и один или два индекса (перегрузка).
    Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая
    вторым индексом (не включительно) Если индекс 1 - начиная с индекса и до конца строки.
    Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
    Оригинальный метод ломает программу, если введены не корректные индексы. Наш метод аварийно
    завершать программу не должен.
     */
    public static String mySubstringMethod(String str, int firstIndex) {
        if (firstIndex < 0 || firstIndex > str.length()) {
            return " ";
        }
        char[] strArray = str.toCharArray();
        int x = (str.length() - firstIndex); // длинна нового массива
        char[] newStrArray = new char[x];
        int j = 0;                           // счетчик для нового массива
        for (int i = firstIndex; i < str.length(); i++, j++) {
            newStrArray[j] = strArray[i];

        }
        return String.valueOf(newStrArray);
    }


    public static String mySubstringMethod(String str, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex > str.length() || secondIndex > str.length()) {
            return " ";
        }
        char[] strArray = str.toCharArray();
        int x = secondIndex - firstIndex;
        char[] newStrArray = new char[x];
        int j = 0;
        for (int i = firstIndex; i < secondIndex; i++, j++) {
            newStrArray[j] = strArray[i];

        }
        return String.valueOf(newStrArray);
    }


}
