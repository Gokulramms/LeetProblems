class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;  

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int row = 0;
        int step = 1;  

        for (int i = 0; i < s.length(); i++) {
            rows[row] += s.charAt(i);

            if (row == 0) step = 1;              
            else if (row == numRows - 1) step = -1; 

            row += step;
        }

        String result = "";
        for (String r : rows) result += r;
        return result;
    }
}