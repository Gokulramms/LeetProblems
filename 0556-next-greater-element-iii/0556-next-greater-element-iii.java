class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (n + "").toCharArray();
        int i = arr.length - 2;
        
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i < 0) return -1;
        
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) j--;
        
        char temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
 
        for (int l = i + 1, r = arr.length - 1; l < r; l++, r--) {
            char t = arr[l]; arr[l] = arr[r]; arr[r] = t;
        }
        
        long val = Long.parseLong(new String(arr));
        return (val > Integer.MAX_VALUE) ? -1 : (int) val;
    }
}
