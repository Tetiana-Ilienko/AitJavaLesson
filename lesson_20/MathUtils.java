package lesson_20;
// статические методы
public class MathUtils {

        public static int sumOfInts(int i, int...nums) {
            int sum = i;
            for(int num : nums) {
                sum += num;
            }
            return sum;
        }

}
