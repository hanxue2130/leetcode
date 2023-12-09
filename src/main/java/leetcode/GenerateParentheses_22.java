package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses_22 {
    public static List<String> al = new ArrayList<>();
    public static void main(String[] args) {
        generate(3);
        display(al);
    }
    public static void display(List<String> s){
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
    public static List<String> generate(int n){
        recursive(0,0,n, "");
        return al;
    }
    private static void recursive(int left,int right, int max, String s) {
        // terminator
        if (left == max & right == max) {
            al.add(s);
        }
        // process current logic: left, right
        if (left < max) {
            recursive(left + 1, right, max, s + "(");
        }
        if (left > right) {
            recursive(left, right + 1, max, s + ")");
        }
        // reverse states
    }
}
