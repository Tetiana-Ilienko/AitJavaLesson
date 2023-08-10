import java.util.Arrays;

public class RubberArray {
    int[] array;

    public RubberArray() {           // coздаем новый массив
        this.array = new int[0];
    }

    public void add(int value) {        // добавляем в массив новую ячейку
        extractArray();
        array[array.length - 1] = value;
    }

    // добавляем сразу несколько значений в массив
    public  void add(int... ints){     // принимает  произвольное количество аргументов типа int
        for (int value: ints) {
            add(value);

        }
    }


    public void extractArray() {
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
    }

    public int size() {
        return array.length;

    }

    public int sumOfValues() {
        int summ = 0;
        for (int value : array) {
            summ += value;
        }
        return summ;
    }
}

