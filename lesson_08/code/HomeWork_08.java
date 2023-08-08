import java.util.Scanner;

public class HomeWork_08 {
    public static void main(String[] args) {

        System.out.println("Task_0");
        int i = 1;
        while (i <= 10) {
            System.out.print("Task" + i++  + ";");

        }
        System.out.println();
        System.out.println();


        System.out.println("Task_01. все числа от 1 до 100, которые делятся на 5 без остатка");
        int number = 1;
        do {
            if (number % 5 == 0)
                System.out.print(number + ";");
            number++;
        }
        while (number <= 100);
        System.out.println();
        System.out.println();


        System.out.println("7 чисел от 1 до 100, которые делятся на 5 без остатка");
        int number1 = 1;
        int count = 1;
        while (number1 <= 100 && count <= 7) {
            if (number1 % 5 == 0) {
                System.out.print(number1 + ";");
                count++;
            }
            number1++;
        }
        System.out.println();
        System.out.println();

        /*
        Task 3 Программа просит пользователя слово "hello" Если пользователь вводит
        правильное слово - программа распечатывает на экран благодарность и завершает работу
        Если вводится не верное слово - программа просит ввести слово снова. До тех пор, пока не будет введено
        запрашиваемое слово

*опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
 По окончанию - вывести число попыток на экран
         */
        System.out.println("Task_03");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Hallo");
        boolean in = true;
        int count1 = 0;
        while (in) {
            String inputWort = scanner.nextLine();
            switch (inputWort.trim()) {
                case "Hallo":
                    System.out.println("Danke schön!");
                    in = false;
                    break;
                default: {
                    System.out.println("Noch mal bitte!");
                   // break;
                }
            }
            count1++;
        }
        System.out.println("число попыток: " + count1);
        // второй вариант
//        String answer ;
//        int attempts = 0;
//        do {
//            System.out.println("Введите Hallo");
//            answer = scanner.nextLine();
//            attempts++;
//        } while (answer.trim().equalsIgnoreCase("hello"));
//        System.out.println("Danke schön!");
//        System.out.println("число попыток: " + attempts);

        /*
        Task 4 Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
         */
//        System.out.println("ввести произвольное число");
//        String inputNumber = scanner.nextLine();
//        int num = Integer.parseInt(inputNumber);
//        int lengthNum = inputNumber.length();
//        int x = 0;
//        int snum = 0;
//        int summNum = 0;
//        while (x < lengthNum) {
//            snum = num % 10;
//            summNum = summNum + snum;
//            num = num / 10;
//            x++;
//        }
//        System.out.println("Summer: " + summNum);

        // второй вариант
        int  userNumber;
        System.out.println("ввести произвольное число");
        userNumber = scanner.nextInt();
        System.out.println("number" + userNumber);
        int sunDigit = 0;

        while (userNumber>0) {
            int digit = userNumber % 10;
            System.out.print(digit + (userNumber>10 ? " + " : " = "));
            sunDigit = sunDigit + digit;
            userNumber = userNumber / 10;
        }
        System.out.println(sunDigit);










    }
}



