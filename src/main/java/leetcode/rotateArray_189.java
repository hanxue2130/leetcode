package leetcode;

public class rotateArray_189 {
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(test,k);
    }
    public static void rotate (int [] nums, int k){
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
            System.out.println((i + k) % nums.length);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}
