class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] str=s.toCharArray();
            Arrays.sort(str);
            String key=new String(str);

            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}