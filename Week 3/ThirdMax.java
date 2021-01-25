class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        
        //sort the given array
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(nums[j]>=nums[j+1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;   
                }
            }
        }
        
        //initialize third_max, count and last_max 
        int third_max = Integer.MIN_VALUE;
        int count = 1;
        int last_max = nums[n-1];
        
        //iterate from the end of the array to find the next two distinct, 
        //largest elements by using the counter count
        for(int i = n-2; i>=0 && count<3 ;i--)
        {
            if(nums[i]!=last_max) 
            {
                count++;
                last_max = nums[i];
                if(count==3)
                {
                    third_max = nums[i];
                }
            }
        }
        
        //if count == 3 , third_max exists else it doesn't 
        return count==3? third_max : nums[n-1];   
    }
}