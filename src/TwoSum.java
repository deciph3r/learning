import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

/*
    It turns out we can do it in one-pass.
    While we are iterating and inserting elements into the hash table,
    we also look back to check if current element's complement already exists in the hash table.
    If it exists, we have found a solution and return the indices immediately.
*/


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                return new int[]{i, map.get(delta)};
            }
            map.put(nums[i], i);
        }

        return new int[]{0, 0};
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }

}
