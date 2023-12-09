package leetcode;

public class SlidingWindowMaximum_239 {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(nums,3);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int index = 0;
        int [] arr = new int[nums.length-k+1];
        for(int i = 0; i < nums.length - k+1; i++) {
            int temp = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++){
                temp = Math.max(temp, nums[j]);
            }
            arr[index] = temp;
            index++;
        }
        return arr;
    }
}
