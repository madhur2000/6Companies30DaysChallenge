// User function Template for Java

class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        
        int width = Math.min(R1[0], R2[0]) - Math.max(L1[0], L2[0]);
        int height = Math.min(L1[1], L2[1]) - Math.max(R1[1], R2[1]);
        
        if(width < 0 || height < 0) 
            return 0;
        return 1;
    }
};
