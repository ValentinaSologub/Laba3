import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = 200;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        int n = 5;

        System.out.println("Input array:");
        System.out.println(Arrays.toString(array));

        int nthLargest = findNthLargest(array, n);
        replaceElements(array, nthLargest);

        System.out.println("\nOutput array with changed values:");
        System.out.println(Arrays.toString(array));
        System.out.println("\nValue " + n + "-го за величиною елемента: " + nthLargest);
    }


    public static int findNthLargest(int[] array, int n) {
        Arrays.sort(array);
        return array[array.length - n];
    }
    
    public static void replaceElements(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                array[i] = value;
            }
        }
    }
}