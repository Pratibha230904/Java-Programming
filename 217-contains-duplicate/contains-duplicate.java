class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=Integer.MIN_VALUE){
            if(nums[i]==nums[i-1]){
               
                nums[i]=Integer.MIN_VALUE;
                 return true;
            }
            }
        }
            
        return false;
    }
}