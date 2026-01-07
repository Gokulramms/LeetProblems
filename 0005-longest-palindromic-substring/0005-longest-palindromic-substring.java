class Solution {
    public String longestPalindrome(String s) {
        String lo="";
        for(int i =0 ;i<s.length();i++){
            for(int j =i ;j<s.length();j++){
                if(ispalindrome(s,i,j)&& (j-i+1)>lo.length()){
                    lo=s.substring(i,j+1);
                }
            }
        }
        return lo;
    }
    private boolean ispalindrome(String s,int left,int right){
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}