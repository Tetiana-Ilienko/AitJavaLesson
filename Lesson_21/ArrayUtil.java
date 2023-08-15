package Lesson_21;

public class ArrayUtil {
    // алгоритм линейного поиска
//    осуществляется перебором
    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
            return i;
        }
        return -1;
    }
//_________________________________________________________________
//     выводим массив на консоль
    public static void printArray(int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (((i == arr.length - 1)) ? "" : ","));
        }
        System.out.println("]");
    }


    //   ________________________________________________________________
//    поиск минимального значения по индексу
//     метод ищет минимум по всему массиву и возвращает индекc
    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //  метод умеет работать от нужного индекса массива
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //    __________________________________________________________
//    сортировка выбором
    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int localMin = minIndex(array, i); // обращается к методу поиска минимального
            // значения начиная с заданного индекса
            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }

    //    _______________________________________________________
//    бинарный поиск значения в массиве
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middlIndex;
        int counter = 0;
        //  проверка, что часть массива моно разделить пополам
        while (startIndex <= endIndex) {
            middlIndex = startIndex + (endIndex - startIndex) / 2;
            counter++;

            // сравниваем значение с искомым
            if (array[middlIndex] == searchValue) {
                System.out.println("Найден за " + counter + " шагов");
                return middlIndex;
            }
            // если значения не равны -
            // определяем какую часть массива мы отбросим
            if (array[middlIndex] > searchValue) {
                endIndex = middlIndex - 1;
            } else {
                startIndex = middlIndex + 1;
            }
        }
        System.out.println("Ничего не найдено! Шагов сделано " + counter);
        System.out.println((" "));
        return -1;
    }

}


