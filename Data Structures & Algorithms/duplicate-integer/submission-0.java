class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;

        for(int j = 0; j < nums.length; j++){
            for(int i = 0; i < nums.length; i++){
                if(nums[j] == nums[i] && i != j){
                    duplicate = true;
                }
            }
        }

        return duplicate;
    }
}