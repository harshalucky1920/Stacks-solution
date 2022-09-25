class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prevPrev=0, prev=0;
        for(int i=0; i<cost.length; i++){
            int temp=prev;
            prev= cost[i]+Math.min(prev,prevPrev);
            prevPrev=temp;
        } return Math.min(prev,prevPrev);
    }
}

//==>Time complexity O(n)
//==>space complexity O(1)