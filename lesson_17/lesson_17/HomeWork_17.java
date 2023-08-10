import java.util.Arrays;
import java.util.Random;

public class HomeWork_17 {
    public static void main(String[] args) {

        Dog dog = new Dog("Mars", 53);
       // dog.whoAmI();
        int lengtArray = 10;
        int range = 150;
        int[] barrierArray = makeArray(lengtArray, range);
        System.out.println("Barriers array  " + Arrays.toString(barrierArray));
        dog.whoAmI();
        int sucBarrierForDog = startTrainingForOneDog(dog,barrierArray);
        System.out.println("Количество перепрыгнутых барьеров: " + sucBarrierForDog);



    }

    public static int startTrainingForOneDog(Dog dog,int[] barriers){ // метод считающий взятые барьеры
        int counter =0;
        for (int barrier : barriers) {
            System.out.println("Попытка перепрыгнуть барьер " + barrier);
           if (dog.getBarrier(barrier)){
               counter++;
           }
            System.out.println("End attempt \n");
        }
        return counter;
    }

    public static int[] makeArray(int lengtArray, int range) { // создаем метод для создания массива с барьерами
        Random random = new Random();
        int[] arrays = new int[lengtArray];
        for (int i = 0; i < lengtArray; i++) {
            arrays[i] = random.nextInt(range +1);
        }
        return arrays;
    }
}
