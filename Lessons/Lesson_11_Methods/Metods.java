import java.util.Arrays;
// lesson_11
public class Metods {
    public static void main(String[] args) {
        sayHello();// обращаемся к методу
        char chSymbol = 'A';
        // распечатываем десятисный код символа
        System.out.println((int) chSymbol);
        // теперь распечатываем с помощью созданного метода
        printDecimalCodeOfChar('A'); // запрашивает значение, которое мы прописали в параметре метода

        // распечатываем массив
        int[] arrays = {44, 54, 13, 66, 35, 21};
        System.out.println(Arrays.toString(arrays)); // обращаемся к методу, который ктото прописал
        printArray(arrays); // распечатываем массив своим написанным методом

        /*
        задача
        написать метод принимающий число.
        вывести на экран надпись: является число четным или нет
         */
        int i = -5;
        evenNumber(i);

        // for-each  используется, когда не надо поребирать конкретные индексы ячеек
        for (int element : arrays) {
            printArray(arrays);
        }
        printNumber(15);


        printNumber(3, 10);


    }

    public static void evenNumber(int number) {
        if (number == 0) {
            System.out.println(number + " Число является не четным и не нечетным");
        } else if (number % 2 == 0) {
            System.out.println(number + " Число является четным"); // метод, потоверяющий число на четность и не четность
        } else {
            System.out.println(number + " Число является нечетным");
        }
    }


    public static void sayHello() {        // создаем метод за основным методом
        System.out.println("Hello");
    }

    // void - метод, который ничего не возвращает
    public static void printDecimalCodeOfChar(char charName)//  ( в скобках прописываем параметры метода)
    {
        System.out.println((int) charName);
    }

    public static void printArray(int[] array) {
        // if (array!=0)
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] + ((i == array.length - 1) ? "" : ", ")));
        }
        System.out.print("]");
        System.out.println();
    }

    // Метод выводящий на экран числа от 1 до n. Число n метод должен принять в параметры
    public static void printNumber(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.printf(i + " ");
        }
    }

    //метод, принимающий на вход два числа
    public static void printNumber(int x, int y) { // перегрузка методов

        for (int i = x; i <= y; i++) {
            System.out.printf(i + " ");
        }
    }

}
