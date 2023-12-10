package outliers.recursive;

import java.util.ArrayList;
import java.util.List;

public class test_1 {
    public static List<String> li = new ArrayList<>();
    public static void main(String[] args) {
        recur("abc");
    }
    public static void recur(String s){
        helper(0,s.length(),"",s);
    }

    private static void helper(int i, int i1,String recur, String result) {
        if(i >= i1) {
            return;
        }
        for (int j = 0; j < i1; j++) {
            li.add(result.charAt(i)+result.charAt(j)+"");
        }
        helper(i+1, i1,result.charAt(i+1)+"",result);
    }
}
