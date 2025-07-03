import java.util.*;

class Solution {

    static void helper(String s, List<List<String>> finalAns, List<String> ans, int idx) {
        if (idx >= s.length()) {
            finalAns.add(new ArrayList<>(ans));
            return;
        }

        helper(s, finalAns, ans, idx + 1);
        ans.add(String.valueOf(s.charAt(idx)));
        helper(s, finalAns, ans, idx + 1);
        ans.remove(ans.size() - 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        List<List<String>> finalAns = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int idx = 0;

        helper(s, finalAns, ans, idx);
        System.out.println(finalAns);
    }
}