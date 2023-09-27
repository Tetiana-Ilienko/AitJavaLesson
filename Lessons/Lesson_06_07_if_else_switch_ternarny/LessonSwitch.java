import java.util.Scanner;

public class LessonSwitch {
    public static void main(String[] args) {
        int x = 5;
        switch (x) {
            case 1: {
                System.out.println(" x = 1 ");
                break;
            }
            case 2: {
                System.out.println(" x = 2");
                break;
            }
            case 3: {
                System.out.println(" x = 3");
                break;
            }
            default:{
                System.out.println(" etwas");
            }
            }

        System.out.println("Отгадай загадку.");
        System.out.println("Что это такое: желтый, большой, с рогами и полный зайцев?");
        System.out.println("Как думаешь?");

        Scanner scanner = new Scanner(System.in);
        String answer= scanner.nextLine();

        answer = answer.trim().toLowerCase(); //// обрезание лишних пробелов и перевод в нижний регистр
/*
к одной переменной мы можем применять бесконечное количество методов
 */
        switch (answer){
            case "Троллейбус!": // тогда не нужны дополнительные кейсы
            case "троллейбус" : //
            case "Троллейбус":{
                System.out.println("Правильно! Ты, наверное, нагуглил.");
                break;
            }
            case "сдаюсь":{
                System.out.println("Очень жаль. Правильный ответ Троллейбус");
                break;
            }
            default:{
                System.out.println("А вот и не правильно! Попробуй еще.");
            }

        }

        }
    }