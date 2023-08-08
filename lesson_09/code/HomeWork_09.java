import java.util.Arrays;
import java.util.Random;

public class HomeWork_09 {
    public static void main(String[] args) {
       /*
        Task 0 Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
        Вывести на экран:   его минимальное значение,  максимальное, среднее арифметическое
        */
        Random random = new Random();
        int length = random.nextInt(20 + 1); // добавляем единицу, чтобы не был нулевой массив
        int[] array;
        array = new int[length];
        int arrayNum;
        int i = 0;
        double arraySum = 0;
        do {
            arrayNum = random.nextInt(1000);
            array[i] = arrayNum;
            arraySum += arrayNum;
            i++;
        } while (i < length);
        System.out.println(Arrays.toString(array));
        int[] newArray;
        newArray = Arrays.copyOf(array, length);
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение массива: " + array[0]);
        System.out.println("Максимальное значение массива: " + array[length - 1]);
        System.out.printf("Cреднее арифметическое массива:  %.2f", arraySum / (length));
        System.out.println();
        /*
        Task 1 Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
         */
        System.out.println("Task_01");
        System.out.println(Arrays.toString(newArray)); // беру массив из предыдущей задачи
        int minNewArray = newArray[0];
        int maxNewArray = newArray[0];
        int index1 = 0;
        int index2 = 0;

        i = 0;
        while (i < length) {
            if (newArray[i] < minNewArray) {
                minNewArray = newArray[i];
                index1 = i;
            }
            if (newArray[i] > maxNewArray) {
                maxNewArray = newArray[i];
                index2 = i;
            }
            i++;
        }
//        newArray[index1] = maxNewArray;
//        newArray[index2] = minNewArray;
        // вророй вариант замены индекса не зная значения ячейки
        int temp = newArray[index1];  // объявляем промежуточную переменную для сохранения данных в ячейке,
        newArray[index1] = newArray[index2]; // факически играем в пятнашки
        newArray[index2] = temp;

        System.out.println(Arrays.toString(newArray));
        /*
        Task 2 Дан массив строк. Вывести на экран все символы из самой длинной строки массива
         */

        String[] arrayString = {"One", "Eighteen", "Twenty",};
        int j = 0;
        //String maxArrayString = "";
        String maxArrayString = arrayString[0]; // присваеваем максимальное  значение первой ячейке массива
        // это общепринятая практика, потом перебираем весь масив, если есть значение больше, переписываем его
        while (j < arrayString.length) {
            if (arrayString[j].length() > maxArrayString.length())
                maxArrayString = arrayString[j];
            j++;
        }
        System.out.println("Самая длинная строка: " + maxArrayString);
        int x = 0;
        while (x < maxArrayString.length()){
            System.out.print(maxArrayString.charAt(x) + "   ");
            x++;}
    }
}
