class Solution {
    public boolean checkRecord(String s) {
        int cA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                if(cA==1){
                    return false;
                }else{
                    cA++;
                }
            }else if(s.charAt(i)=='L'){
                if(i+2<=s.length()-1 && s.charAt(i+1)=='L' &&s.charAt(i+2)=='L'){
                    return false;
                }
            }
        }
        return true;
    }
}