import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class LessonDoWhile {
    public static void main(String[] args) {
        int i=0;
        while (i!=0){                                    // сначала выполняется условие, потом выполняется цикл
            System.out.println("i !=0 ");}

        do {                                           // сначала выполняется, потом прверяется условие
            System.out.println(" do -while i !=0 ");
        }  while (i!=0);

        System.out.println("+++++++++++++");
        Scanner scanner = new Scanner(System.in);
        int answerInt;
        do {
            System.out.println("Enter number <= 10");
        answerInt = scanner.nextInt();
        System.out.println("You entered number " + answerInt);
        } while (answerInt > 10);
        System.out.println(answerInt > 10);
        System.out.println("Good. There is good number " + answerInt);

        System.out.println("++++++++++++++++");
        /*
        посчитать среднее фарифметическое № случайных чисел в диапазоне от 1 до 100
        и получить от пользователя в консоли
         */
        Random random = new Random();
        System.out.println("Enter number");
        int userInt= scanner.nextInt();

        int counter = 1;
        int sum = 0;
        while (counter <= userInt){
            int randomInt = random.nextInt(100+1);
            sum = sum + randomInt;
            counter++; // каунтер итераций
        }
        System.out.println("Sum: " + sum);
        System.out.println("Цикл завершен. Количество повторений " + (counter -1) );
        System.out.println("Среднее арифметическое: " + (double)sum/(counter-1));


    }
}
