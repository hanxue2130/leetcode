package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class threeSum_15 {
    public static void main(String[] args) {
        int [] a = {-1,0,1,2,-1,-4};
        Arrays.sort(a);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i],i);
        }
        //-4,-1,-1,0,1,2

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int k = -a[i] - a[j];
                if(hm.containsKey(k) && hm.get(k) > j){
                    System.out.println(a[i] +"," + a[j] + "," + k);
                }
            }
        }
    }
}
