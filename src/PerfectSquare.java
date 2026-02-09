public class PerfectSquare {

    public static boolean isPerfectSquare(int left, int right, int target) {
        int mid = (left + right) / 2;
        int aux = mid * mid;
        if (left > right) return false;
        if (mid * mid == target) return true;
        else if (aux < target) {
            return isPerfectSquare(mid + 1, right, target);
        } else {
            return isPerfectSquare(left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(isPerfectSquare(1, n, n));
        n = 7;
        System.out.println(isPerfectSquare(1, n, n));

    }
}
