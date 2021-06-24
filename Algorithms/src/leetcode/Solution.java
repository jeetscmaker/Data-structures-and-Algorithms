package leetcode;
/** Max Consecutive Ones,
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1)
            return (nums[0] == 1 ? 1 : 0);

        int maxCount = 0;
        int count = (nums[0] == 1)? 1 : 0;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                if(nums[i-1] == 1) {
                    maxCount = count>maxCount ? count : maxCount;
                    count = 0;
                }
            }
        }
        maxCount = count>maxCount ? count : maxCount;
        return maxCount;
    }

    public static void main(String[] args) {

    }
}
