package HomeWork_18;

public class RubberArrayHomeWork {
    int[] array;

    public RubberArrayHomeWork() {           // coздаем новый массив // конструктор
        this.array = new int[0];
    }

    // Поиск элемента по значению
    public int searchValueByIndex(int value) {

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return i;
        }
        return -1;
    }
}
