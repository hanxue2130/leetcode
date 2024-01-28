class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }
        for (Character temp:stack) {
            sb.append(temp);
        }
        return sb.toString();
    }
}