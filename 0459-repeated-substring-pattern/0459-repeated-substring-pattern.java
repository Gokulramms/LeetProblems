class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String twice=s+s;
        return twice.substring(1,twice.length()-1).contains(s);
    }
}