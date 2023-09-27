package Lesson_25;

import java.util.Arrays;

public class Main_25 {
    public static void main(String[] args) {
        String str = "Hello";// можем создать строку примитивным способом. Значение помещается в String РООL
        String str3 = "Hello";// и для двух str3 и str при такой записи используется одна ячейка памяти
        String str4 = "Hell";


        String str1 = new String(); // конструктор, создание пустой строки. Создается отдельная ячейка
        String str2 = new String("Hello"); // конструктор, создание строки со значением
        System.out.println(str1 == str1);// true
        System.out.println(str == str3);// true
        System.out.println(str == str4); // false
        System.out.println(str == str1); // false

        //массив символов
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        // строка из массива символов
        String strArr = new String(array);
        System.out.println(strArr);

//  +++++++++++++++      методы строк ++++++++++++++++++++++++++
        //  charAt(int index) - возвращает символ на позиции index в сторке
        String string = "Hello Java";
        System.out.println(string.charAt(0)); // H
        System.out.println(string.charAt(1)); // e
        System.out.println(string.charAt(2)); // l

        //  метод длинна строки
        string.length();
        string.charAt(string.length() - 1); //  последний индекс в строке

//     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // boolean equals(String str)  метод сравнивания строк по значению
        String string1 = new String("Hello");
        System.out.println(string == string1); // сравниваются  ссылки
        System.out.println(string.equals(string1)); // сравниваются значения

        // equalsIgnoreCase() -  сравнивает строки без учета регистра
        // сравнивать строки нужно всегда с помощью метода  equals(String str) или equalsIgnoreCase()

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // int compareTo ( String string) - метод сравнивает две строки d в соответствии со значением
        // каждого символа в таблице Unicode ( лексико- графический метод)
        // е.т. строки сравниаются в лексикографическом порядке. Если они равны, то метод возвращает 0
        // если одна строка больше - возвращает положительное значение, если меньше - отрицательное

        System.out.println("hello".compareTo("hello")); //  возращает 0
        System.out.println("ahello".compareTo("bhello")); // -1 , а < b  по Unicode
        System.out.println("bhello".compareTo("ahello")); // 1, b > a по Unicode
        System.out.println("chello".compareTo("ahello")); // 2, c > a   на 2 по Unicode

        String empty = "";
        System.out.println("hello".compareTo(empty)); // 5  //  так можно тоже определить длину строки
        // compareToIgnoreCase -  перегруженный метод, игнорирующий регистр
        String str10 = "begin";
        String str11 = "Begin";
        System.out.println(str11.compareTo(str10)); // -32 ( коды отстоят друг от друга на 32)
        System.out.println(str11.compareToIgnoreCase(str10)); // 0

//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//       1.  int indexOf(int ch) -  возвращает индекс позиции в cтроке на которой первый раз встречается символ  ch

//       2.  int indexOf(char ch, int fromIndex) -  перегруженный метод возвращает индекс в строке на которой
//        первый раз встречается символ ch  после индекса fromIndex

//       3.  int indexOf( String str)  - возвращает индекс  str в той строке на которой он вызывается

//       4. int indexOf( String str, int fromIndex )

//        Метод возвращает -1, если символ либо строка не найдены
        String strJava = "Java";
        int positionOfJ = strJava.indexOf('J');
        int positionOfA = strJava.indexOf('a');
        int positionOfA2 = strJava.indexOf('a', 2);

        System.out.println("position of J is " + positionOfJ);// 0
        System.out.println("position of a is " + positionOfA);// 1
        System.out.println("position of a is " + positionOfA2);// 3

        int positionOfAV = strJava.lastIndexOf("av");//  возвращает 1

//      +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//      lastIndexOf ( char cr) -  возвращает индекс последнего вхождения символа в строку
//      аналогично методу indexOf , метод имеет четыре модификации (смотри выше)
        String strJava1 = "Java";
        int lastPosOfA = strJava1.lastIndexOf('a'); // 3

//     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//     substring(int beginIndex) - возвращает подстроку данной строки с символа на позиции beginIndex
//        String strJava = "Java";
        strJava.substring(1);// выводит 'ava'
//      substring(int beginIndex, int endIndex)
        strJava.substring(1, 3); // выводит 'av' ( индекс конца не включается)

//      ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//      boolean startsWith(String str) -  проверяет начинается ли строка со строки str
//      boolean startsWith(String str, int fromIndex )
        String string25 = "Hello word!";
        System.out.println(string25.startsWith("Hello"));// true
        System.out.println(string25.startsWith("He"));// true
        System.out.println(string25.startsWith("word"));// false
        System.out.println(string25.startsWith("word", 6));// true

        string25 = " Hello word!";
        System.out.println(string25.startsWith(" ")); // true  проверяет начинаться ли с пустой строки
//      +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        endsWith(): определяет, заканчивается ли строка на определенную подстроку
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        toLowerCase(): переводит все символы строки в нижний регистр
//
//        toUpperCase(): переводит все символы строки в верхний

//        replace(): заменяет в строке одну подстроку на другую
//
//        trim(): удаляет начальные и конечные пробелы
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        concat() - соединение строк
//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        join() -  соединяет строки иначе чем  concat()
        String message = String.join("-", "Hello", "Java", "Tra", "la", "la");
        // вывод  Hello-Java-Tra-la-la

//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        split(regex str)
        String sentence = "Hello Java and word";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [Hello, Java, and, word]

        words[1] = "Javascript"; //  заменяет слово в первой ячейке
        String result = String.join(" ", words); // соединяет массив в строку с разделителем - пробел
        System.out.println(result); // Hello Javascript and word

//     ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//      toCharArray() -  возвращает массив символов из данной строки

        String strA = new String("Java");
        char[] chars = strA.toCharArray();

        for (char c : chars) {
            System.out.print(c + " ");  // J a v a
            System.out.println();

        }

//    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//      static String valueOf() -  возвращает строчное представление int, long, float, double, char
//
      String value23 = String.valueOf(23);
      System.out.println(value23 + 2);


    }
}

