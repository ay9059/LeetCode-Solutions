//Solution to JumpGame: https://leetcode.com/problems/jump-game/submissions/

class Solution {
    public boolean canJump(int[] nums) {
        
        int lastindex=nums.length-1;
        boolean answer=false;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=lastindex){
                lastindex = i;
                answer = true;
            }else{
                answer = false;
            }
        }
        return answer;
}
}
