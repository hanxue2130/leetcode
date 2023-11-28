package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegerbyTheNumberof1Bits_1356 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8};
        int [] ans = new int [arr.length];
        SortIntegerbyTheNumberof1Bits_1356 sort1 = new SortIntegerbyTheNumberof1Bits_1356();
        ans =  sort1.sortByBits(arr);

        for(int i:ans) {
            System.out.println(i);
        }
    }

    public int[] sortByBits(int[] arr) {
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Comparator<Integer> comparator = new CustomComparator();
        Arrays.sort(nums, comparator);
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }

    class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (Integer.bitCount(a) == Integer.bitCount(b)) {
                return a - b;
            }
            return Integer.bitCount(a) - Integer.bitCount(b);
        }
    }

}

