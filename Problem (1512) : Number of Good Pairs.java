class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int goodPairs = 0;

        for (int num : nums) {
            // Add the number of times this value has appeared before
            goodPairs += count[num];
            // Increment frequency for current number
            count[num]++;
        }

        return goodPairs;
    }
}
