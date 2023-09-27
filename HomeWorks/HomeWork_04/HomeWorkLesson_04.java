public class HomeWorkLesson_04 {
    public static void main(String[] args) {

        System.out.println("Task_01.");
        String strName = "Vyacheslav";
        int length = strName.length();
        System.out.println("My name has " + length   + " letters.");
        char chFirst = strName.charAt(0), chLast = strName.charAt(length-1);
        int chFirstCode = chFirst, chLastCode = chLast;
        ///  strName.codePointAt() - метод вывода десятичного кода  на экран

        System.out.println("First symbol " + chFirst + " has code : " + chFirstCode);
        System.out.println("Last symbol " + chLast + " has code : " + chLastCode);

        System.out.println("Task_02.");
        String str1 = "Java", str2 = "is", str3 = "a", str4 = "powerful", str5 = "language";
        // 1 variant
        String str = String.join(" " , str1, str2, str3, str4, str5), str0 = ".";
        /* в методе можно использовать как разделитель табуляцию.
        String.join( ":\t ", str1, str2, str3, str4, str5)

         */
        System.out.println(str.concat(str0));
        int length1 = str.length() + 1;
        System.out.println(length1);
        // 2 variant
        String strSum = str1 + " "+ str2 + " " + str3 + " " + str4 + " " + str5 + ".";
        System.out.println(strSum);
        System.out.println(strSum.length());

        System.out.println("Task_02.2");
        System.out.println(strSum.replaceAll("powerful", "super"));
        boolean contAg = strSum.contains(" age ");
        System.out.println(contAg);

        System.out.println("Task_03");
        String st1 = "string", st2 = "code", st3 = "Practice";
        int x = st1.length();
        int midlX = x/2;
        System.out.println("Result 1: " + st1.substring(midlX-1,midlX +1));
        x = st2.length();
        midlX = x/2;
        System.out.println("Result 2: " + st2.substring(midlX-1,midlX +1));
        x = st3.length();
        midlX = x/2;
        System.out.println("Result 3: " + st3.substring(midlX-1,midlX +1));


    }
    /*
       пишем метод для 3 задачи отдельно.
    public static String middleChars(String str){
        String result = "";
        int x = st1.length();
        int midlX = x/2;


     */


    }



