class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int c = 1; 
       
        for (int i = 1; i < n; i++) {
            
            if (nums[i] != nums[i - 1]) {
                nums[c] = nums[i];
                c++;
            }
        }
        
        return c; 
    }
}
