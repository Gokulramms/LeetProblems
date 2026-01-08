class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(1, n, k, new ArrayList<>(), res);
        return res;
    }

    void helper(int s, int n, int k, List<Integer> cur, List<List<Integer>> res) {
        if(cur.size()==k){ 
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i=s;i<=n;i++) {
            cur.add(i);
            helper(i + 1, n, k, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
