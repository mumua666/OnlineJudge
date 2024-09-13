package Array;

public class P209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int subLength = 0, sum = 0, i = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLength = (j - i) + 1;
                result = result < subLength ? result : subLength;
                sum -= nums[i++];
            }
        }
        return result < Integer.MAX_VALUE ? result : 0;
    }
}
