import java.util.Arrays;

public class HomeWork_11 {
    public static void main(String[] args) {
        /*
        Task 0

         */
//        int[] newArray = {1, 45, 89, 66, 44, 87, 90, 145};
        int[] newArray = {};
        printReverseOrder(newArray);
        printReverseOrder(newArray, 1);
        printReverseOrder(newArray, true);
        /*
        Task 1
         */
        squareNumber(12, 0);
        /*
        Task 2
         */
        myPrintArray(newArray, " Number ");
        System.out.println("Task 2 (опционально)");
        System.out.println(Arrays.toString(newArray));
        myCopyOfArray(newArray, -3);

    }

    /*
    Task 0
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
         - Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в
        обычном порядке, а начиная с этого индекса в обратном:
        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
        Еще одна перегрузка: метод принимает массив и булевый флаг.
        Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
     */
    public static void printReverseOrder(int[] array) {
        if (array == null) {
            System.out.println("Не верные аргументы метода.Пришел null");
        } else {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + ((i == 0) ? "" : ", "));
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void printReverseOrder(int[] array, int index) {
        if (index > array.length || index < 0) {
            System.out.println("Error");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length & i <= index; i++) {
                System.out.print(array[i] + ", ");
            }
            for (int i = array.length - 1; i > index; i--) {
                System.out.print(array[i] + ((i == 0) ? "" : ", "));
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void printReverseOrder(int[] array, boolean bool) {
        System.out.print("[");
        if (bool == true) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + ((i == 0) ? "" : ", "));
            }
        } else if (bool == false) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();

    }

    /*
    Task 1
     Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число
     */
    public static void squareNumber(int number, int square) {
        int resulte = 1;
        for (int i = 1; i <= square; i++) {
            resulte *= number;
        }
        System.out.println(number + " ^ " + square + " = " + resulte);
    }
    /*
    Task 2
        Написать свой метод printArray - принимает массив целых чисел.
        Формирует строку вида:[el1, el2, ... elN]
        и распечатывающий эту строку
     */

    public static void myPrintArray(int[] array, String el) {

        System.out.print("[" + el);
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] + ((i == array.length - 1) ? "" : ", " + el)));
        }
        System.out.print("]");
        System.out.println();
    }

    /*
    Task 2 (опционально)
    Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
    на вход принимает массив целых чисел и число - длину нового массива. Метод должен создать и
    распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из
    входящего массива:
    {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
    Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
     */
    public static void myCopyOfArray(int[] array, int length) {
        if (array != null && length <= array.length && length >= 0) { // защита от введения не корректных значений
            int[] copyArray = new int[length];
            for (int i = 0; i < length; i++) {
                copyArray[i] = array[i];
            }
            System.out.println(Arrays.toString(copyArray));
        } else {
            System.out.println(Arrays.toString(array));
        }
    }

}


