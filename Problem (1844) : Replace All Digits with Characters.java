class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i += 2) {
            // Shift the character at (i - 1) by the digit at position i
            arr[i] = (char) (arr[i - 1] + (arr[i] - '0'));
        }

        return new String(arr);
    }
}
