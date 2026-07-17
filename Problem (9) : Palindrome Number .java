class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int a = x;
        if (x<0)
            return false;
        
        while(x!=0){
            
            r = (r*10)+(x%10);
            x=x/10;

        }
        return a==r;
    } 
        
    
     
        
        
        
    
}
