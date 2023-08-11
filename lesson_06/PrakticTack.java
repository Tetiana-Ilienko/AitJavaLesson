package lesson_06;

import java.util.Random;

public class PrakticTack {
    public static void main(String[] args) {
//        Random random = new Random();
//        int x = random.nextInt();
//        System.out.println(x);
//        if (x>0){
//            System.out.println("Number is greater than 0: " + x );
//        } else if (x<0) {
//            System.out.println("Number is less than 0: " + x );
//        } else  (x==0) {
//            System.out.println("Number is  0: " + x );
//        }

        Random random = new Random();
//        int x = random.nextInt(20);
//        System.out.println("First number: " + x);
//
//        int y = random.nextInt(20);
//        System.out.println("First number: " + y);
//
//        int z = random.nextInt(20);
//        System.out.println("First number: " + z);
//        if (x == y & y == z) {
//            System.out.println("All numbers are equal.");
//        } else if (x==y || x==z || z==y) {
//            System.out.println("Some numbers are equal");
//        } else {
//            System.out.println("All the numbers are different");
//        }

        int x = random.nextInt(20);
        System.out.println("First number x: " + x);

        int y = random.nextInt(20);
        System.out.println("First number y: " + y);

        int z = random.nextInt(20);
        System.out.println("First number z: " + z);

        if (x < y & y < z) {
            System.out.println("increasing");
        } else if (z < y & y < x) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither increasing nor decreasing ");
        }


    }
}
