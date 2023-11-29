package outliers.Array;

import java.util.Scanner;

public class ClimbingStairs_Analysis {
    public static void main(String[] args) {
        method2(5);
    }
    public static void method2(int n){
       int [] k = new int [n+1];
       k[0] = 1;
       k[1] = 2;
        for (int i = 3; i <= n; i++) {
            k[i] = k[i-1] + k[i-2];
        }
        System.out.println(k[n]);
    }
    public static void mehotd1(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the stairs you want to climb");
        int n = myObj.nextInt();
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;
        for (int i = 3; i <= n; i++) {
            s3 = s1+s2;
            s1=s2;
            s2=s3;
        }
        System.out.println(s3);
    }
}
