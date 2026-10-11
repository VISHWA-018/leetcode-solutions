class Solution {
    public void nextPermutation(int[] nums) {
        int min=-1;
        int n=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                min=i;
                break;
            }
        }
        if(min!=-1){
            for(int i=n-1;i>min;i--){
                if(nums[i]>nums[min]){
                    int temp=nums[min];
                    nums[min]=nums[i];
                    nums[i]=temp;
                    break;
                }        
        }
        }
        
        
    Arrays.sort(nums,min+1,nums.length);
        
    }
}