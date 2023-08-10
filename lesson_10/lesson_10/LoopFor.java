public class LoopFor {
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
