public class test {
    public static void main(String[] args) {
        String a = "abcdefg";
        String b = "25abdfxx";
        int index = 0;
        int count = 0;
        String [] arr = new String [9];
        for (int i = 0; i < b.length(); i++) {
            char tem = b.charAt(i);

            if(!Character.isLetter(tem)) {
                arr[index] =tem+"";
                index++;
                count++;
            }
            else if(i>=count && tem != b.charAt(i-1)+1){
                arr[index] = b.charAt(i-1)+"";
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
