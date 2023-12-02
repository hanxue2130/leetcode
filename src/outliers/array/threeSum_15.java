package outliers.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_15 {
    public static void main(String[] args) {
        int [] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer = new ArrayList<>();
        answer = method1(a);
        displyResult(answer);
    }
    public static List<List<Integer>> method1(int [] a){
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
                if (i == 0 || a[i - 1] != a[i]) {
                int left = i + 1, right = a.length - 1;
                while(left < right) {
                    int sum = a[left] + a[right] + a[i];
                    if( sum < 0 ) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        answer.add(Arrays.asList(a[i],a[left++],a[right--]));
                        while (left < right && a[left] == a[left + 1]){left++;}
                        while (left < right && a[right] == a[right - 1]){right--;}
                    }
                }
            }
        }
        return answer;
    }
    public static void displyResult(List<List<Integer>> display) {
        for (int i = 0; i < display.size(); i++) {
            for (int j = 0; j < display.size(); j++) {
                System.out.print(j);
            }
        }
    }
}
