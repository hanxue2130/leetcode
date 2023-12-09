package leetcode;

public class maxSub_53 {
    public static void main(String[] args) {

//        method();
        method1();
    }


    public static void method() {
        int [] a = new int [] {-2,1,-3,4,-1,2,1,-5,4};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int tem = 0;
            for (int j = i; j < a.length; j++) {
                tem += a[j];
                max = Math.max(max, tem);
            }
        }
        System.out.println(max);
    }
    public static void method1(){
        int [] a = new int [] {-2,1,-3,4,-1,2,1,-5,4};
        int tem = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            tem = Math.max(num, tem + num);
            max = Math.max(max,tem);
        }
        System.out.println(max);

    }
}
