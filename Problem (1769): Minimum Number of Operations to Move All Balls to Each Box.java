class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        
        int[] arrBox=new int[n];
        for(int i=0; i<n; i++){
            arrBox[i]=boxes.charAt(i)-'0';
        }

        int[] res=new int[n]; 

        int oneCnt=0, cumSum=0;
        // Left to right pass moving count
        for(int i=0; i<n; i++){
            res[i]+=cumSum;
            oneCnt+=arrBox[i];
            cumSum+=oneCnt;
        }

        oneCnt=0; cumSum=0;
        // Right to left pass moving count          
        for(int i=n-1; i>=0; i--){
            res[i]+=cumSum;
            oneCnt+=arrBox[i];
            cumSum+=oneCnt;
        }


        return res;
    }
}
