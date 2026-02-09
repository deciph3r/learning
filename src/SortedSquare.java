import java.util.Arrays;

public class SortedSquare {
    public static int[] sort(int[] arr) {
        int[] sortedSquares = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int i = arr.length - 1; i > 0; i--) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                sortedSquares[i] = arr[left] * arr[left];
                left++;
            } else {
                sortedSquares[i] = arr[right] * arr[right];
                right--;
            }

        }
        return sortedSquares;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 7, 10})));
    }
}
