class Solution {
    public String reverseVowels(String s) {
        // Step 1: Convert string to char array (because String cannot be modified)
        char[] arr = s.toCharArray();
        
        // Step 2: Collect vowels into a list
        List<Character> cha = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                cha.add(arr[i]); // store vowel
            }
        }

        // Step 3: Replace vowels from the end of the list (to reverse)
        int index = cha.size() - 1; // start from last vowel
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                arr[i] = cha.get(index--); // put vowels back in reverse
            }
        }

        // Step 4: Return new string
        return new String(arr);
    }

    // Helper function to check vowels
    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
