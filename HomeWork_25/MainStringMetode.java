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
    /*
    можно использовать метод toCharArray()
     */

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

    public static String removeDuplicateChars( String str){
        String result = new String("");// Создается пустая строка result, которая будет
        // содержать уникальные символы.
        char[] chars = str.toCharArray();// Строка str преобразуется в массив символов chars. Это делается для того,
        // чтобы мы могли проходить по каждому символу отдельно.
        for (int i = 0; i < str.length(); i++) { //  Цикл начинается, и мы проходим по каждому символу
                if(result.indexOf(chars[i]) == -1)//Это условие проверяет, есть ли символ chars[i] в строке result.
                    // Метод indexOf возвращает индекс первого вхождения символа в строку. Если символ не найден,
                    // то indexOf вернет -1.
                {
                    result += chars[i]; // abcd //Если символ chars[i] не найден в строке result,
                    // то он добавляется к строке result.
                }
        }
        return result;//этот метод создает новую строку result, проходит по каждому символу в исходной строке str,
        // и если символ еще не содержится в строке result, то он добавляется к ней. Таким образом,
        // в итоге возвращается строка, содержащая только уникальные символы.
    }

    /*
    кoд Цезаря. Использовать маленькие буквы английского алфавита. Сдвиг на 5
     */

    public static String takeZesCode(String str, int move) {
        String coded = ""; //  задаем пустую строку для ответа
        int lastCharValue = 'z'; // z= 122 ( шестнадцатеричный код)
        int alphabetLength = 'z' - 'a' + 1; // a=97 вычисляем длинну алфавита
        for (char character : coded.toCharArray()) {
            int charNoRotation = character + move;

            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            // Если новое значение символа меньше значения 'z', то используется это значение.
            // В противном случае, вычитаем длину алфавита для циклического сдвига.
            coded += (char) charValue;
            // Преобразуем числовое значение символа обратно в символ и добавляем к строке coded.

        }
        return coded;

    }

}

