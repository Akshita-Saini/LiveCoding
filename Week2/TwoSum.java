class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int[] res = new int[2];
        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
                break;
            else if(numbers[left]+numbers[right]>target)
            {
                right--;
            }
            else if(numbers[left]+numbers[right]<target)
            {
                left++;
            }
        }
        res[0]=left+1;
        res[1]=right+1;
        return res;
    }
}