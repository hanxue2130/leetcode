package leetcode;

public class validAnagram_242 {
    public static void main(String[] args) {
        String s = "unkonw";
        String t = "unkonw";
        int [] a = new int [26];
        for(char i:s.toCharArray()) {
            a[i-'a']++;
        }
        for(char j:t.toCharArray()) {
            a[j-'a']--;

        }
        for(int i:a) {
            if(i!=0) {
                System.out.println("yes");
            }
        }
        System.out.println("no");
    }

}
