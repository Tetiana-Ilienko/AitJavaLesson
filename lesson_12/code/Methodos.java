import java.util.Arrays;
// Methods. Lesson_12
public class Methodos {
    public static void main(String[] args) {
        // powMethod(3);
        powInMethod(-3);
        int rusultFromMethod = squeaInmetod(-1);
        System.out.println(rusultFromMethod);
        System.out.println(squeaInmetod(6));
        //  int resultFromMethod = powMethod(3); метод не возвращает значение - такая запись не возможна

        //написать метод, принимающий массив целіх чисел и находящий минимальное значение в массиве
        int[] array = {1, 2, 3, 4, -1, 6};
        // если array = null  выскочит ошибка, нужно это учитывать
        int minInArray = foundMonArray(array);
        //  System.out.println("min in array: " + minInArray); // выводим минимальное значение массива, не всегда будет
        //  корректно

        System.out.println(foundMonArray(array)); // выводим на печать индекс минимального элемента массива
        System.out.println("======================");
        System.out.println(Arrays.toString(array));
        if (array != null && isNumberInArray(array,100) != -1){
            array[isNumberInArray(array,100)]=256;
        }
        System.out.println(Arrays.toString(array));


    }
    // написать метод, определяющий есть ли в массиве число Х

    public static boolean inchNumberInArray(int[] arr, int x) {
        if (arr == null) return false;// проверка на null

        for (int value : arr) {// Ищем совпадения. Если нашли - возврат true. Работа метода останавливается
            if (value == x) {
                return true;
            }
        }
        return false;
    }
    // Найти элемент в массиве и вернуть его индекс.

    public static int isNumberInArray(int[] arr, int numberForSearch) {
        if (arr == null) return -1;// проверка на null

        for (int i =0; i< arr.length; i++) {// Ищем совпадения. Если нашли - возврат true. Рвбота метода останавливается
            if (arr[i] == numberForSearch) {
                return i;
            }
        }
        return -1 ;
    }


    public static void powMethod(int x) {
        if (x >= 0) {
            int result = 1;
            for (int i = 0; i < x; i++) {
                result = result * 2;
            }
            System.out.println(result);
        } else {
            System.out.println("Не верное агрументы вызова метода");
        }
    }

    // пишем метод с возвращаемым значением int
    public static int powInMethod(int x) {
        int result = 1; //объявление переменной, в которой будет храниться результат вычислений в методе
        //тип этой переменной совпадает с уникальным типом возвращенного значения метода
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            // x<0
        }
        return result; // возвращаем результат наших вычислений. Тип тип должен соответствовать указанному типу
        // возвращенного значения
    }

    // напишите метод, принимающий  число и возвращающий  квадрат этого числа
    public static int squeaInmetod(int x) {
        int result = x * x;
        return result;
    }

    public static double squeaInmetod(double x) {
        return x * x;//краткая запись метода, можно расписать как в предыдущем
    }

    //написать метод, принимающий массив целіх чисел и находящий минимальное значение в массиве
    public static int foundMonArray(int[] arr) {
        if (arr != null) {
            int minIndex = 0;
            int min = arr[0]; // иноцализация переменой значение, хранящихся в 0 ячейке массива

//            // нахождение min значения в массива
//            for (int value : arr) {
//                if (value < min) {
//                    min = value;
//                }
//            }
            for (int i = 0; i < arr.length; i++) { // цикл for переписываем на for each
                // будем возвращать индекс ячейки. В таком случае, если с массивом что-то не так выведеться -1
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            return minIndex; // возврат результата работы
        } else {
            // пришел null. Что возвращать?
            return -1;
        }
    }


}
