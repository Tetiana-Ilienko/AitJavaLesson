public class LoopFor {
    /*
    Цикл for является наиболее распространённым циклом в программировании, поэтому его следует изучить.
    Цикл for проводит инициализацию перед первым шагом цикла. Затем выполняется проверка условия цикла,
    и в конце каждой итерации происходит изменение управляющей переменной.

                for(<начальная точка>; <условие выхода>; <изменение счетчика>) {
                 // Тело цикла
                }
     Счетчик цикла не обязательно должен быть целочисленным. Вполне допустим, например, тип double. И даже тип String:
                  for (String str = "Hello"; str.length() < 10; str = str + "1") {
                   System.out.println(str);
                   }

     Операторы continue и break
     Оператор break позволяет выйти из цикла в любой его момент, даже если цикл не закончил свою работу:


                   for (int i = 0; i < 10; i++){
                   if (i == 5)
                   break;
                   System.out.println(i); }

      Когда счетчик станет равным 5, сработает оператор break, и цикл завершится.
      Теперь сделаем так, чтобы если число равно 5, цикл не завершался, а просто переходил к следующей итерации.
      Для этого используем оператор continue:

                     for (int i = 0; i < 10; i++){
                     if (i == 5)
                     continue;
                     System.out.println(i); }

      В этом случае, когда выполнение цикла дойдет до числа 5, программа просто пропустит это число и перейдет к следующему.





     */
    public static void main(String[] args) {
        //  for ([начальное значение]; [условие]; [изменение счетчиков])
        int j = 0;
        while (j < 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        System.out.println(" end while loop");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" end for loop");


        //распечатать числа от 5 до 20
        for (int i = 5; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        int[] array = {5, 10, 34, 545, -10};
        for (int k = 0; k < array.length; k++) {
            System.out.print(" Massive "+ array[k] + " ");
        }
        System.out.println();
        //вывести на экран индекс элемента по заданному значению

        int forSearch = 545;
        for (int k = 0; k < array.length; k++) {
            if (array[k] == forSearch) {
                System.out.println("заданный индекс: " + k);
                break; // прерывает цикл
                // continue - прерывает текущую итерацию цикла, и возвращается к условию  продолжает цикл
            }
        }


    }

}
