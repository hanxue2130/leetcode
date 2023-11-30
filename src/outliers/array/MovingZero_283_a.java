package outliers.array;

public class MovingZero_283_a {
    //loop put non-zero first and then put zero afterwards
    //count zero
    public static void main(String[] args) {
        int [] test = {0,1,0,3,12};
        method(test);
    }
    public static void method(int [] test) {
        int index = 0;
        int len = test.length;
        for (int i = 0; i < len; i++) {
            if(test[i] != 0) {
                test[index++] = test[i];
                test[len--] = 0;
            }
        }
    }

}
