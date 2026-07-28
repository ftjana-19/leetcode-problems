class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }

            // Whenever the count of 'L' and 'R' balances out, we split
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
