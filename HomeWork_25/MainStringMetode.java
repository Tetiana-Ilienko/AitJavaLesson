package HomeWork_25;

import java.util.Arrays;

public class MainStringMetode {
    public static void main(String[] args) {
        /*
        Задача 1
Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
public boolean strEndsWithAnotherStr ( String str1, str2)

Задача2
Написать метод, создающий массив символов из содержимого строки
public char[] createsCharArray( String str)

         */

        String str1 = new String("Hello Java");
        String str2 = new String("Java - programming language");
        String str3 = new String("I love Java");
        String str4 = new String(" ");
        String str5 = new String("ava");

        System.out.println(strEndsWithAnotherStr(str1, str2));
        System.out.println(strEndsWithAnotherStr(str1, str3));
        System.out.println(strEndsWithAnotherStr(str1, str4));
        System.out.println(strEndsWithAnotherStr(str1, str5));

        System.out.println(Arrays.toString(createsCharArray(str1)));
        System.out.println(Arrays.toString(createsCharArray(str4)));

        String str6 ="abbccccaadbb";
        System.out.println(removeDuplicateChars(str6));


    }

    //++++++Task 01+++++++++++++++++++++++++++++++++++++++++++
    public static boolean strEndsWithAnotherStr(String str1, String str2) {
        String str = returnLastStr(str2);
        return str1.endsWith(str);
    }


    private static String returnLastStr(String str) {
        String[] words = str.split(" ");
        String lastStr;
        if (words.length > 0) {
            lastStr = words[words.length - 1];
        } else {
            lastStr = " ";
        }
        return lastStr;
    }

    //++++++Task 02+++++++++++++++++++++++++++++++++++++++++++
    public static char[] createsCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

// ++++++Task 03+++++++++++++++++++++++++++++++++++++++++++
   /*
    Написать метод, удаляющий из строки повторяющиеся символы
    String removeDuplicateChars( String string)
    пример: "abbccccaadb" -> "abcd"
    */
    /* 1. создаем пустую строку
       2. перебираем символы.
       3. Записываем символ один раз в новую строку
     */
    // TODO не корректно работает
    public static StringBuilder removeDuplicateChars( String str){
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)!=str.charAt(i+1)){
                result.append(str.charAt(i));
            }
        }
        return result;
    }


















    /*
    кoд Цезаря. Использовать маленькие буквы английского алфавита. Сдвиг на 5
     */

    public static String takeZesCode(String str, int move) {
        String coded = ""; //  задаем пустую строку для ответа
        int lastCharValue = 'z'; // z= 122 ( шеснацатиричный код)
        int alphabetLength = 'z' - 'a' + 1; // a=97
        for (char character : coded.toCharArray()) {
            int charNoRotation = character + move;

            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            coded += (char) charValue;

        }
        return coded;

    }
}
