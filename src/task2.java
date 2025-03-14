import java.util.HashMap;
public class task2 {
    public static int findDominant(int[] array) {
        int candidate = -1, count = 0;

        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }
        return (count > array.length / 2) ? candidate : -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 3, 3, 2, 2};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {5, 5, 5, 5, 1};
        System.out.println(findDominant(arr1));
        System.out.println(findDominant(arr2));
        System.out.println(findDominant(arr3));
    }
}