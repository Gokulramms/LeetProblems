class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < strs[0].length() && i < strs[strs.length - 1].length()) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                str.append(strs[0].charAt(i));
                i++;
            } else {
                break;
            }
        }

        return str.toString();

    }
}