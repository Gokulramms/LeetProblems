class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.lastIndexOf(" ");
        return s.length()-last-1;
    }
}