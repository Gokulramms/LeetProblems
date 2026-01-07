class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxi=0;
        for(int right =0;right<s.length();right++){
            char c=s.charAt(right);

            if(map.containsKey(c)&&map.get(c)>=left){
                left = map.get(c)+1;
            }
            map.put(c,right);
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}