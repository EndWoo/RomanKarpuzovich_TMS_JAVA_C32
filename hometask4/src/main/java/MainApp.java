import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArrayMath arrayMath = new ArrayMath();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arrayMath.arrayFlipping(arr1);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {8, 5, 7, 1, 2, 3, 4, 5, 8};
        int[] arr4 = arrayMath.middleElementArrayRemove(arr3);
        System.out.println(Arrays.toString(arr4));
    }
}
