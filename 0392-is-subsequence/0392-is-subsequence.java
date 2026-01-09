class Solution {
    public boolean isSubsequence(String s, String t) {
        int index_s=0;
        int index_t=0;
        while(index_t<t.length() && index_s<s.length()){
            if(t.charAt(index_t)==s.charAt(index_s)){
                index_s++;
            }
            index_t++;
        }
        
        return (index_s==s.length());
    }
}