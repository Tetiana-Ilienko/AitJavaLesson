import java.util.Arrays;
import java.util.Random;

public class HomeWork_17 {
    public static void main(String[] args) {

        Dog dog = new Dog("Mars", 60);
       // dog.whoAmI();
        int lengtArray = 5;
        int range = 150;
        int[] barrierArray = makeArray(lengtArray, range);
        System.out.println("Barriers array  " + Arrays.toString(barrierArray));
        dog.whoAmI();
        for (int barrier : barrierArray) {
           // System.out.println("Ap! Barrier!  " + barrier );
            dog.getBarrier(barrier);
        }



    }


    public static int[] makeArray(int lengtArray, int range) {
        Random random = new Random();
        int[] arrays = new int[lengtArray];
        for (int i = 0; i < lengtArray; i++) {
            arrays[i] = random.nextInt(range);
        }
        return arrays;
    }
}
