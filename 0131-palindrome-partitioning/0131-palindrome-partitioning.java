import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        dfs(0, s, new ArrayList<>(), res);
        return res;
    }

    void dfs(int i, String s, List<String> cur, List<List<String>> res) {
        if (i == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (pal(s, i, j)) {
                cur.add(s.substring(i, j + 1));
                dfs(j + 1, s, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    boolean pal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
