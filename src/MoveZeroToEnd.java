import java.util.Arrays;

public class MoveZeroToEnd {
    static int[] moveZeroes(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]== 0) count++;
            else if(count>0 && nums[i]!=0){
                nums[i-count] = nums[i];
                nums[i]=0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
    }
}

