import java.util.Arrays;

public class HomeWork_12 {
    public static void main(String[] args) {
        System.out.println(simpleNumberMethod(11111));

        int[] arrays = {12, 14, 50, 7, 61, 4, 90, -11, 4, 1253, 17};
        System.out.println(simpleNumberInMassive(arrays));
        String[] stringArray = {"DGHFJKH", "sjdg", "fd", "d", "dfgh", "ghjk",};
        System.out.println(Arrays.toString(returnMinMaxString(stringArray)));
        System.out.println(Arrays.toString(returnPrimNumber(arrays)));
        System.out.println(Arrays.toString(createArrayOfPrimeNumber(arrays)));

    }

    /*
    Task 0
    Написать метод принимающий целое число и проверяющий является ли число простым.
    Если является, метод должен вернуть true, не является - false
     */
    public static boolean simpleNumberMethod(int x) { // Название должно говорить, что делает метод.
        // В названии метода должны быть глаголы
        if (x <= 1) {              // Число не является простым
            return false;
        }
//        if (x == 2) {            // Число является простым/ на самом деле этот цикл не нужен.
//            return true;         // При оптимизации работы программы мы его убираем
//        }
        for (int i = 2; i <= Math.sqrt(x); i++) { //проверяем последовательность до корня квадратного из вводимого числа
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    /* Оптимизированная программа поиска простого числа через квадратный корень и метод "решето"

     public static boolean isNumberPrimeVar2(int number) {
         if (number <= 1) return false;     //  number = 1;   2 < 1 -> false
         if (number % 2 == 0 || number % 3 == 0) return false;

                                           // number = 64. Цикл проверит только делители 5, 7 - т.е. всего 2 итерации
         for (int i = 5; i < Math.sqrt(number); i += 6) {
                                           //  5, 7, 11, 13, 17, 19, 23, 25, 29, 31)
             if (number % i == 0 || number % (i + 2) == 0) {
                 return false;
             }
             return true;
         }
     }
     */

    /*
    Task 1
    Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
    Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
     */
    public static int simpleNumberInMassive(int[] array) {
        int counter = 0;
        if (array == null) return counter; // проверка на существование массива и элементов в нем
        for (int i = 0; i < array.length; i++) {
            if (simpleNumberMethod(array[i]) == true) { // if (simpleNumberMethod(array[i])) более правильная запись
                // так так используемый метод возвращает true по умолчанию
                counter++;
            }
        }
        return counter;
    }

    /*
    Task 3
    Написать метод, принимающий на вход массив строк.
    Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
     */
    public static String[] returnMinMaxString(String[] str) {
        //  if (str.length == 0 ) return  null;   // не нужная проверка
        if (str == null) return new String[]{};  // второй вариант записи String[0]// возвращаем пустой массив
        /*
        проверяем случай, если в массиве есть пустые ячейки(первая ячейка пустая - мы ей присваиваем минимальное
        и максимальное значение - работать программа не будет
        String minStrArray = null;
        String maxStrArray = null;
        for (String str : strings) {              //Пытается найти в массиве не null строку. Т.е. имеющую значение.
            if (str != null) {
                smallestStr = str;
                longestStr = str;
                break;
            }
        }
        if (smallestStr == null)
            return new String[]{}; //Если в массиве не нашлось ни одной не нулевой строки, возвращаем пустой массив.




         */
        String minStrArray = str[0];
        String maxStrArray = str[0];
             /* цикл for-each
                for (String str: string){
                if(str.length() <  minStrArray.length() ){
                minStrArray = str;}
                if (str.length() > maxStrArray.length()){
                maxStrArray = str;}
         */
        for (int i = 0; i < str.length; i++) {
            if (str != null) {                                // проверяем строчку на нулевое значение
                if (str[i].length() < minStrArray.length()) { // сравниваем текущую строку с минимальным значением
                    minStrArray = str[i];                      // если меньше - перезаписываем
                }
                if (str[i].length() > maxStrArray.length()) {   // то же самое с большим
                    maxStrArray = str[i];
                }
            }
        }
        String[] newStr = {minStrArray, maxStrArray};
        return newStr;
    }

    /*
        Task 3 опционально
        Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только
        из простых чисел,  присутствующих в изначальном массиве
        вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
         */
    public static int[] returnPrimNumber(int[] array) {
        if (array == null) return new int[0]; // проверяем, если массив пустой
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (simpleNumberMethod(array[i]))
                count++;
        }
        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (simpleNumberMethod(array[i])) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
    /*
    правильный вариант
     */
    public static int[] createArrayOfPrimeNumber(int[] numbers){
        if (numbers == null) return new int[0];
        int[] resultLong = new int[numbers.length];
        int count = 0;

        for (int value: numbers) {
            if (simpleNumberMethod(value)) {
                resultLong[count] = value;
                count++;
            }
        }
        int[] resultShort = new int[count];
        for (int i =0; i < count; i++){
            resultShort[i] = resultLong[i];
        }
        return resultShort;
    }

}



