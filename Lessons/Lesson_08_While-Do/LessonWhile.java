import java.util.Random;

public class LessonWhile {
    /*
    Цикл while выполняется до тех пор, пока заданное условие является верным (имеет значение true):
    Предикат — условие, которое указывается в скобках после ключевого слова while и вычисляется на каждой итерации

Тело цикла — блок кода в фигурных скобках, аналогичный блоку кода в методе. Все константы или переменные, определенные
внутри этого блока, будут видны только внутри этого блока

     Цикл while - цикл с предусловием
     цикл do-while - цикл с постусловием
     */
    public static void main(String[] args) {

        int i = 0;

        while (i <= 10) {
            System.out.println("Hallo!" + i); // тело цикла
            i = i + 1; // инкремент - переменная инкрементируеться
            // System.out.println("Hallo!" + i++); // второй вариант
            // i++ - сначала переменная используется, потом добаляется единица
            // ++i - сначала прибавляется единица, потом выводиться на печать
        }
        System.out.println("Цикл1 завершен.");
        i = 100;
        while (i > 90) {
            System.out.println("Hallo!" + i--);
        }
        System.out.println("Цикл2 завершен.");

        int y = 0;
        Random random = new Random();
        int randomNumber, count12 = 0, count13 = 0;
        while (y < 1_00_000) {
            randomNumber = random.nextInt(13);
            if (randomNumber == 12) count12++;
            if (randomNumber == 13) count13++;
            y++;
        }
        System.out.println("count12: " + count12 + " count13: " + count13);


        int counter = 1;                          // счетчик цикла
        while (counter<=5){
            System.out.println(counter++);

        }

        System.out.println("+++++++++++++++"); //
        int number = 1;
        while (number <= 20) {
            // System.out.println(number++);
            if (number % 2 == 0)
                System.out.println(number);
            number++;
        }
    }


}
