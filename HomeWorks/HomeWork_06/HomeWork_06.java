import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
//        System.out.println("Task_0");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter number '1' or '2' or '3' ");
//        int userInputIng = scanner.nextInt();
//        if (userInputIng == 1) {
//            System.out.println("You entered '1'");
//        } else if (userInputIng == 2) {
//            System.out.println("You entered '2'");
//        } else if (userInputIng == 3) {
//            System.out.println("You entered '3'");
//        } else {
//            System.out.println("You entered something");
//        }
//        System.out.println("Task_01");
//        Random random = new Random();
//        int x = random.nextInt(100);
//        int y = random.nextInt(100);
//        int z = random.nextInt(100);
//        int h = random.nextInt(100);
//        System.out.println("First number: " + x);
//        System.out.println("Second number: " + y);
//        System.out.println("Third number: " + z);
//        System.out.println("Fourth number: " + h);
        /*
        int max = a:
        if( b> max){ max = b }
        max = ( c > max )? c : max;
        if ( d > max ) max = d

         */
//        if (x == y & y == z & z == h) {
//            System.out.println("All the numbers are equal");
//        } else if (x > y && x > z && x > h) {
//            System.out.println("The largest number: " + x);
//        } else if (y > z && y > h) {
//            System.out.println("The largest number: " + y);
//        } else if (z > h) {
//            System.out.println("The largest number: " + z);
//        } else {
//            System.out.println("The largest number: " + h);
//        }

        System.out.println("Task_02");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter four numbers");
        String userInputStr = scanner1.nextLine();
        int lengthStr = userInputStr.length();
        //System.out.println(lengthStr);
        if ((lengthStr != 4)) {
            System.out.println("The number entered is not correct");
        } else {
            /*
            char ch0 = userInputStr1.charAt();
            работаем с десятичным кодом
            if ((int) ch0 + ch 1== (int) ch2 + ch3) {}
             */
            String userInputStr1 = userInputStr.substring(0, 1);
            String userInputStr2 = userInputStr.substring(1, 2);
            String userInputStr3 = userInputStr.substring(2, 3);
            String userInputStr4 = userInputStr.substring(3, 4);

            int parseInt1 = Integer.parseInt(userInputStr1);
            int parseInt2 = Integer.parseInt(userInputStr2);
            int parseInt3 = Integer.parseInt(userInputStr3);
            int parseInt4 = Integer.parseInt(userInputStr4);
            int int1 = parseInt1 + parseInt2;
            int int2 = parseInt2 + parseInt3;
            String strNumber1 = String.valueOf(parseInt1);
            String strNumber2 = String.valueOf(parseInt2);
            String strNumber3 = String.valueOf(parseInt3);
            String strNumber4 = String.valueOf(parseInt4);
            String strNumber5 = String.valueOf(int1);
            String strNumber6 = String.valueOf(int2);
            String str1 = "(" + strNumber1 + "+" + strNumber2 + ")" + " = " + strNumber5;
            String str2 = "(" + strNumber3 + "+" + strNumber4 + ")" + " = " + strNumber6;


            if ((parseInt1 + parseInt2 == parseInt3 + parseInt4)) {
                System.out.println("Number " + userInputStr + "->" + str1 + " end " + str2 + "->>  "
                        + int1 + " = " + int2 + " ->>> Number is lucky");
            } else {
                System.out.println("Number " + userInputStr + "->" + str1 + " end " + str2 + "->>  "
                        + int1 + " it is not equal " + int2 + " ->>> Number is not  lucky");
            }


        }


    }
}
