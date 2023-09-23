package leetcode;

import java.util.*;
// Example 1:
//
//
//Input: words = ["a","b","ba","bca","bda","bdca"]
//Output: 4
//Explanation: One of the longest word chains is ["a","ba","bda","bdca"].
//
//
// Example 2:
//
//
//Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
//Output: 5
//Explanation: All the words can be put in a word chain ["xb", "xbc", "cxbc",
//"pcxbc", "pcxbcf"].
//
//
// Example 3:
//
//
//Input: words = ["abcd","dbqca"]
//Output: 1
//Explanation: The trivial word chain ["abcd"] is one of the longest word
//chains.
//["abcd","dbqca"] is not a valid word chain because the ordering of the
//letters is changed.
public class LongestStringChain {
    public static void main(String[] args) {
        String [] words =  {"a","b","ba","bca","bda","bdca"};
        LongestStringChain test = new LongestStringChain();
        System.out.println(test.longestStrChain(words));
    }
    public int longestStrChain(String[] words) {
        Map<String, Integer> memo = new HashMap<>();
        Set<String> wordsPresent = new HashSet<>();
        Collections.addAll(wordsPresent, words);
        int ans = 0;
        for (String word : words) {
            ans = Math.max(ans, dfs(wordsPresent, memo, word));
        }
        return ans;
    }

    private int dfs(Set<String> words, Map<String, Integer> memo, String currentWord) {
        if (memo.containsKey(currentWord)) {
            return memo.get(currentWord);
        }
        int maxLength = 1;
        StringBuilder sb = new StringBuilder(currentWord);
        for (int i = 0; i < currentWord.length(); i++) {
            sb.deleteCharAt(i);
            String newWord = sb.toString();
            if (words.contains(newWord)) {
                int currentLength = 1 + dfs(words, memo, newWord);
                maxLength = Math.max(maxLength, currentLength);
            }
            sb.insert(i, currentWord.charAt(i));
        }
        memo.put(currentWord, maxLength);
        return maxLength;
    }

}

