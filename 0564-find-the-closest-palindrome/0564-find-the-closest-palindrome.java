class Solution {
    public String nearestPalindromic(String n) {
        long x = Long.parseLong(n), ans = -1, len = n.length();
        long[] a = {(long)Math.pow(10, len) + 1, (long)Math.pow(10, len - 1) - 1};
        long p = Long.parseLong(n.substring(0, (int)((len + 1) / 2)));
        for (long i = p - 1; i <= p + 1; i++) {
            String s = i + "";
            String r = new StringBuilder(s).reverse().toString();
            a = java.util.Arrays.copyOf(a, a.length + 1);
            a[a.length - 1] = Long.parseLong(s + r.substring((int)(len % 2)));
        }
        for (long v : a)
            if (v != x && (ans == -1 || Math.abs(v - x) < Math.abs(ans - x) || 
               (Math.abs(v - x) == Math.abs(ans - x) && v < ans))) ans = v;
        return "" + ans;
    }
}
