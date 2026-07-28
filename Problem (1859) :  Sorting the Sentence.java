class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];

        for (String word : words) {
            // Get 1-based index from the last character
            int index = word.charAt(word.length() - 1) - '0';
            // Extract the word without the trailing number
            String actualWord = word.substring(0, word.length() - 1);
            
            // Place in 0-indexed array
            sorted[index - 1] = actualWord;
        }

        // Join words with a single space
        return String.join(" ", sorted);
    }
}
