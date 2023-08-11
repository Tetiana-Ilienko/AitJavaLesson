import java.util.Arrays;

public class RubberArray {
    int[] array;

    public RubberArray() {           // coздаем новый массив // конструктор
        this.array = new int[0];
    }

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


    public void extractArray() {                                  // растянуть массив
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
    public int[] toArray() {
        //  return Arrays.copyOf(array,array.length); можно использовать данный метод для создания копии
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    //удалить элемент по индексу
//    ----------------------------------------------------------------------------
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

    // Поиск элемента по значению
//---------------------------------------------------------------------
    public int searchByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return i;
        }
        return -1;
    }

    //    удалить элемент по значению
//    -------------------------------------------------------------------
    public boolean deleteByValue(int value) {
        int indexByValue = searchByValue(value);
        if (indexByValue < 0) return false;
        deleteByIndex(indexByValue);
        return true;
    }

    //    удаление Всех элементов, имеющих значение Х
//    __________________________________________________________________
    public int deleteAllByValue(int value) {
        int count = 0;
        while (deleteByValue(value)) {
            count++;
        }
        return count;
    }

    //    возвращение значения по индексу
//    ______________________________________________________________________
    public int getValueByIndex(int index) {
        if (index < 0 || index >= array.length) {
            return Integer.MIN_VALUE;
        }
        return array[index];
    }

    //       заменить по индексу значение в массиве
//    ______________________________________________________________________
    public boolean changeValueByIndex(int index, int newValue) {
        if (isIndexInCorrect(index)) {
            return false;
        }
        array[index] = newValue;
        return true;
    }

    private boolean isIndexInCorrect(int index) {
        return (index >= 0 || index < array.length);
    }


}

