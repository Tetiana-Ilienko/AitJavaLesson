package lesson_20;

public class FinalDemo {
    public static void main(String[] args) {
        final int x;

        x = 10;
//      x = 5; final  не дает перепресвоить новое значение переменной

//         могу создать массив и работать с ним.
//        !!!!!!! переприсвоить ссылку - не могу
        final int[] ints = {0, 23, 45, 42, 45};
//        ints = null;

//        ints = new int[5]; // инициализация массива

        ints[0] = 0;
        ints[1] = 1;
        ints[0] = 5;
        ints[1] = ints[0] + 15;

        // ints = new int[7]; // не могу присвоить ссылку на другой объект

    }

}
