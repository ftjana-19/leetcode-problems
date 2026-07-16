class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[2*n];
        int i =0;
        while(i < n){
             
            
            r[2*i]=nums[i];
            r[2*i+1]=nums[i+n]; 
            i++;
            
            
        }
        

        return r;
    }
}
