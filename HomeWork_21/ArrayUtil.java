package HomeWork_21;

public class ArrayUtil {

    private static final int firstIndex=0; // константа

    public static void printArray(int[] arr) {
        printArrayFromIndex(arr,firstIndex);
    }

    public static void printArrayFromIndex(int[] arr, int index) {
        if (index < 0 || index > arr.length) {
            index = firstIndex;
        }
        System.out.print("[");
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i] + (((i == arr.length - 1)) ? "" : ", "));
        }
        System.out.println("]");

    }




}
