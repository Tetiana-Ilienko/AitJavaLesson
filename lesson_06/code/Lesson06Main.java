import java.util.Random;
import java.util.Scanner;

public class Lesson06Main {
    public static void main(String[] args) {
//        int x = 10;
//
//        if (x <= 10) System.out.println("Hello everybody!");
//        System.out.println("x befor if; " + x);
//
//        if (x == 10) {
//            x = x - 1;
//            System.out.println("x in if: " + x);
//        }
//        System.out.println("x after if; " + x);

        /*

         */

        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter number 1");
//        int userInputIng = scanner.nextInt();
//        if (userInputIng == 1) {
//            System.out.println(" You entered number 1");
//
//        } else if (userInputIng == 3) {
//            System.out.println("You entered number 3");
//        } else if (userInputIng == 5) {
//            System.out.println("You entered number 5");
//
//        } else {
//            System.out.println("You entered a different number ");
//        }
//        System.out.println("exit operator if");

        /*

         */
        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5);
        System.out.println("Note is: " + note);

        if (note == 5) {
            money += 20;
        } else if (note == 4) {
            money += 10;
        } else if (note == 3) {

        } else if (note == 2) {
            money -= 20;
        } else if (note == 1) {
            money = 0;
        } else {
            System.out.println(("Nicht correct"));
        }
        System.out.println("Child has: "+ money);
    }


}

