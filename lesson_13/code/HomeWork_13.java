import java.util.Arrays;

public class HomeWork_13 {
    public static void main(String[] args) {


        String[] newStringArray = {"Banana","", "Apple", null, "Pear", "Plum", "Peach", " Strawberry", "", null};
        //String[] newStringArray = {};
        System.out.println(searchStringIn(newStringArray, "Plum"));

        String string = "Hello";
        String string1 = "He";
        String string2 = "H";

        System.out.println(returnClippedString(string));
        System.out.println(returnClippedString(string1));
        System.out.println("null" + (returnClippedString(string2)));

        int[] array1 = {1, 2, 3, 4, 5,};
        //int[] array1 = {};

        System.out.println(mySumOfArray(array1));
        System.out.println(" Copy of array: " + Arrays.toString(myCopyOfArray(array1)));
        System.out.println(" Copy of array: " + Arrays.toString(myCopyOfArray(newStringArray)));
        System.out.println(" Copy of array + Size : " + Arrays.toString(myCopyOfArray(array1, 10)));
        System.out.println(" Copy of array + Size : " + Arrays.toString(myCopyOfArray(array1, 3)));


    }

    /*
    Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
     */
    public static boolean searchStringIn(String[] array, String str) {
        for (String valStr : array) {
            if (valStr == str) {  // if (valSrt !=0 && valStr.equals(str))
                return true;
            }
        }
        return false;
    }

    /*
    вариант 2
     */
//    public static int searchIndexInArray(String[] array, String str) {
//        if ((array == null) || (str == null)) {
//            return -1;
//            for (int i = 0; i < array.length; i++) {
//                if (str != null &&  array[i] = array.equals(str)) ){
//
//                }
//            }
//        }
//        return -1;
//    }

    /*
    Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
    переведенных в верхний регистр. Распечатать полученный результат в методе main
     "Hello" -> "EL"
     "He" -> "E"
     "H" -> ???
     */
    public static String returnClippedString(String str) {
        String newStr = "";
        if (str == "") return newStr;
        if (str.length() > 3) {
            newStr = str.substring(1, 3).toUpperCase();
            return newStr;
        }
        if (str.length() > 0 & str.length() < 3) {
            newStr = str.substring(1).toUpperCase();
            return newStr;
        }
        return newStr;

    }

    /*
    Task 3
    Реализуйте метод sumOfArray (сумма элементов массива),
    который получает на вход массив и определяет сумму его элементов.
     */
    public static int mySumOfArray(int[] array) {
        int sum = 0;
        for (int valArray : array) { //цикл for-each  используем когда не нужна работа с индексом.
            sum += valArray;
        }
        return sum;
    }
    /*
    Task 3 опционально
    Написать метод copyOfArray, возвращающий массив:
    Метод принимает массив целых чисел и возвращает копию этого массива.
    - Перегрузка: метод принимает массив строк и возвращает копию массива
    - Перегрузка: Метод принимает массив целых чисел и число (newSize) - длину нового массива.
    Новый массив заполняется значениями из входящего массива. Сколько поместится.
    Если чисел не хватило -> остаток массива заполняется 0.
    {1, 2, 3, 4, 5} -> copyOfArray(array, 3) -> {1, 2, 3}
    {1, 2, 3, 4, 5} -> copyOfArray(array, 7) -> {1, 2, 3, 4, 5, 0, 0}
     */


    public static int[] myCopyOfArray(int[] array) {
        int count = array.length;
        int[] copyArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static String[] myCopyOfArray(String[] array) {
        int count = array.length;
        String[] copyArray = new String[count];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static int[] myCopyOfArray(int[] array, int newSize) {
        int[] copyArray = new int[newSize];           // создаем новый массив, где будет храниться скопированный
        for (int i = 0; i < array.length && i < newSize; i++) { // цикл работает пока i меньше размера
                                                        // старого массива и или размера нового массива
            copyArray[i] = array[i];
        }
        for (int i = array.length; i < newSize; i++) { // когда дошли до конца размера нового массива, и эта цифра
                                                    // меньше длинны нового - заходим в цикл на пустые записываем 0
            copyArray[i] = 0;
        }

        return copyArray;
    }

}
