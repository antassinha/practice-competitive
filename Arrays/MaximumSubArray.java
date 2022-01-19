public class MaximumSubArray {

    // Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    // A subarray is a contiguous part of an array.
    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6
    // Explanation: [4,-1,2,1] has the largest sum = 6.

    public static int maxSubArray(int[] nums) {
        int max = 0;
        int sum =0;
        for(int i =0;i< nums.length; i++){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum<0) sum = 0;
        }
        return max; 
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        
    }
    
}
