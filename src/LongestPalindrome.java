public class LongestPalindrome {
    static String longestPalindrome(String s) {
        String max="";
        int right = 1;
        for(int left=0;left<s.length();left++){
            while(right<=s.length()) {
                String candidate = s.substring(left, right);
                if(isPalindrome(candidate) && candidate.length()>max.length()) {
                    max = candidate;
                }
                right++;
            }
             right = left+1;
        }
        return max;
    }

    static boolean isPalindrome(String s){
        int right = s.length()-1;
        for(int left=0;left<right;left++) {
            if(s.charAt(left) != s.charAt(right)) return false;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        ;
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }
}
