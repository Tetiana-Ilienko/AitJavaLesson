import java.util.Random;

public class BooleanCodeHome_05 {
    public static void main(String[] args) {
        System.out.println("Task_01");
        Random random = new Random();
        int var1 = random.nextInt(20);

        boolean x = var1 % 2 == 0;
        boolean y = var1 % 3 == 0;
        boolean z = true & true;
        z = x & y;
        if (var1 == 0) {
            System.out.println("selected number is 0 ");
        } else {
            System.out.println("selected number is: "+var1 + ": " + " even number: " + x + ", multiple of 3: " + y + ", " +
                    "even number und multiple of 3: " + z);
        }


        System.out.println("Task_02");
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (false) ^ (6 == 5));
        System.out.println((true | false) | (true));
        System.out.println((true) | (true));
        System.out.println(true);


    }
}
