class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        int n=word.length();
        for(char c:word.toCharArray()){
            if(c<97){
                count++;
            }
        }
        if(count==n || count==0 ){
            return true;
        }else if(count==1 && (char)word.charAt(0)<97){
            return true;
        }
        else{
            return false;
        }
    }
}