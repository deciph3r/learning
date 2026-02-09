public class PerfectNumber {
    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for(int i=1 ; i*i<n ; i++) {
            if(n % i == 0) {
                sum += i;
                int complement = n / i;
                if(complement != i && complement!=n) sum+=complement;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
