package leetcode;

public class LargestRectangleInHistogram_84 {


    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        method1(arr);
    }
    public static void method1(int [] arr){

        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = Integer.MAX_VALUE;
            for (int j = i; j <  arr.length; j++) {
                height = Math.min(height, arr[j]);
                area = Math.max(area, (j - i + 1) * height);
            }
        }
        System.out.println(area);
    }
    public static void method2(int[] height){
        int maxArea = 0;
        int length = height.length;
        for (int i = 0; i < length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < length; j++) {
                minHeight = Math.min(minHeight, height[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        System.out.println(maxArea);
    }
}
