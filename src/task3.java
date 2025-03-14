import java.util.Arrays;

public class task3 {

    public static int[] rotateArray(int[] array, int positions) {

        int n = array.length;

        if (n == 0 || positions % n == 0) return array;

        positions = positions % n;
        int[] rotated = new int[n];



        System.arraycopy(array, n - positions, rotated, 0, positions);


        System.arraycopy(array, 0, rotated, positions, n - positions);

        return rotated;

    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.toString(rotateArray(arr1, 2))); // [4, 5, 1, 2, 3]

        System.out.println(Arrays.toString(rotateArray(arr2, 3))); // [1, 2, 3]

    }

}