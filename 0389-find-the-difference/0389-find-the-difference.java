class Solution {
    public char findTheDifference(String s, String t) {
        int[] fre=new int[26];
        for(char c:t.toCharArray()){
            fre[c-'a']++;
        }
        for(char c:s.toCharArray()){
            fre[c-'a']--;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]>0){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}