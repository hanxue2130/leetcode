package leetcode;

public class containerWithMostWater_11 {
    public static void main(String[] args) {
        int [] test = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test));
    }
    public static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int max = 0;
        while(i < j) {
            int area = (j-i) * Math.min(height[i],height[j]);
            max = Math.max(max, area);
            if(i<j && height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
