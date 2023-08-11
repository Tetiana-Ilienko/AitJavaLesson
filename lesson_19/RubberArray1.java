package lesson_19;

import java.util.Arrays;

public class RubberArray1 {
//  поля класса
//___________________________________________________________________________________________________
    private int[] array;
    // coздаем новый массив(пустой). конструктор класса.
// --------------------------------------------------------------------------------------------------------
    public RubberArray1() {
        this.array = new int[0];
    }
//      копирование массива
//---------------------------------------------------------------------------------------------------------------
//    1 вариант
//    public RubberArray1(int[] arr) {
//        this.array = new int[arr.length];
//        for (int i = 0; i < 0; i++) {
//            array[i] = arr[i];
//        }
//    }
//    2  вариант
//    public RubberArray1(int[] arr){
//        this.array = Arrays.copyOf(arr,arr.length);
//    }
//    3 вариант
    public RubberArray1(int[]arr){
        this();
        add(arr);
    }
//---------------------------------------------------------------------------------------------------

    public void add(int value) {        // добавляем в массив новую ячейку
        extractArray();                 // обращаемся к методу
        array[array.length - 1] = value;
    }

    // добавляем сразу несколько значений в массив // перезагрузка метода add
    public void add(int... ints) {     // принимает  произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);

        }
    }
//------------------------------------------------------------------------------------------------------
// делаем метод приватным - для пользователя он не доступен
    private void extractArray() {                                  // растянуть массив
        array = Arrays.copyOf(array, array.length + 1);  // воспользуемся методом "Arrays.copyOf"
        // копируем массив и добавляем новую ячейку
    }

    public void printArray() {                                     // метод распечатки массива
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
    }

    public int size() {   // количество элементов в массиве
        return array.length;

    }

    public int sumOfValues() { // сумма значений массиве
        int summ = 0;
        for (int value : array) {
            summ += value;
        }
        return summ;
    }

    public int min() {
        // проверка, если длинна массива 0 возвращаем самое маленькое значение
        if (array.length <= 0) return Integer.MIN_VALUE; //  выводим минимальное число  int
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() {
        // проверка, если длинна массива 0 возвращаем самое маленькое значение
        if (array.length <= 0) return Integer.MIN_VALUE; //  выводим минимальное число  int
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Получить RubberArray в виде обычного массива
    /*
    при работе с массивом нужно учитывать, что работаем с сылочными типами данных.
    Обязательно нужно создавать копию
     */
    public int[] toArray() { // этот метод фактически является геттером
        //  return Arrays.copyOf(array,array.length); можно использовать данный метод для создания копии
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    //удалить элемент по индексу
    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >= 0 && index < array.length) { // проверка по не корректным индексам
            int[] result = new int[array.length - 1];
            for (int i = 0; i < result.length; i++) {
                if (i < index) {  // до заданного индекса переписываем массив
                    result[i] = array[i];
                } else { // if (i>=index) // когда индекс равен заданному - записываем значение из массива (i+1)
                    result[i] = array[i + 1];
                }
            }
            array = result;
        }
    }
}
