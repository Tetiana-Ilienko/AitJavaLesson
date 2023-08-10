import java.util.Scanner;

public class LessonSwitchHome {
    public static void main(String[] args) {
        System.out.println("Task_0");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number '1' or '2' or '3' ");
        int useInput = scanner.nextInt();

        switch (useInput) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три");
                break;
            default:
                System.out.println("Вы ввели что-то другое");
        }
        System.out.println("Task_01");
        //Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number from 0 to 7 ");
        int userInputInt = scanner.nextInt();

        switch (userInputInt) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong input!");

        }
        System.out.println("Task_02");
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Eigeben eine Note");
        int note = scanner.nextInt();
        System.out.println("Die Note ist : " + note);
        int timeTv = 45;
        int i = 0;
        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("Ausgezeichnet!");
                i = 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Gut gemacht!");
                i = 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Es geht.");
                i = 15;
                break;
            case 3:
                System.out.println("Das ist nicht gut!");
                i -= 30;
                break;
            case 2:
            case 1:
                i -= timeTv;
                System.out.println("Das ist nicht gut!");
                System.out.println("Kein Fernseher heute!");
                break;
            default:
                System.out.println("Die Note ist nicht Korrekt");
        }
        int timeTvEnd = timeTv + i;
        System.out.println("Du kannst Fernseher : " + timeTvEnd + " minuten anschauen.");


    }
}





