package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class twoSum_15 {
    public static void main(String[] args) {
        method2();
        method2();

    }
    public static void method2(){
        int [] a = {-1,0,1,2,-1,-4};
        int target = 2;
        HashMap<Integer,Integer> hm = new HashMap();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for (int i = 0; i < a.length; i++) {
            if(hm.containsKey(target-a[i]) && hm.get(target-a[i])!= i){
                System.out.println(target +"  "+ a[i]);
            }
        }
    }
    public static void method1(){
        int [] a = {-1,0,1,2,-1,-4};
        int [] result = new int[2];
        int target = 2;
        for (int i = 0; i < a.length; i++) {
            List<Integer> tem = new ArrayList<>();
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    result[0] = a[i];
                    result[1] = a[j];
                }
            }
        }
        System.out.printf("[");
        for (int i = 0; i < result.length; i++) {
            if(i != result.length-1)
                System.out.print(a[i]+",");
            else
                System.out.print(a[i]);
        }
        System.out.print("]");
    }
}
