class Solution {
    public int longestPalindrome(String s) {
        int[] fre=new int[126];
        int count=0;
        boolean odd=false;
        for(char c:s.toCharArray()){
            fre[c-'A']++;
        }
        for(int i:fre){
            if(i%2==0){
                count+=i;
            }else{
                count+=i-1;
                
                odd=true;
            }         
        }
        if(odd){
            count++;
        }
        return count;
    }
}
