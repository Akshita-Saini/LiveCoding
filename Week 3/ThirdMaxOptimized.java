class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long third_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long max = nums[0];
        for(int i=1 ; i<n; i++)
        {
            if(nums[i]>max)
            {
                third_max = second_max;
                second_max = max;
                max = nums[i];
            }
            else if(nums[i]>second_max && nums[i]!=max)
            {
                third_max = second_max;
                second_max = nums[i];
            }
            else if(nums[i]>third_max && nums[i]!=second_max && nums[i]!=max)
            {
                third_max = nums[i];
            }
        }
        if(third_max == Long.MIN_VALUE)
            return (int)max;
        return (int)third_max;
    }
}