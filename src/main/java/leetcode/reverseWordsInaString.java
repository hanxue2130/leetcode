package leetcode;

import net.sf.saxon.style.XSLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseWordsInaString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] arrOfStr = s.split("\\s+");

        for (int i = arrOfStr.length - 1; i >= 0; i--) {
            sb.append(arrOfStr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        System.out.println('"' + sb.toString()+ '"');
    }
}
