class Solution {
    public boolean asc(int[] nums) {
        int n=nums.length;
        int i=0,j=i+1;
       
        while(j<n && i<j){
            if(nums[i]>nums[j]){
                return false;
                 
            } 
            else{
                i++;
                j++;
            } 
              
        }
       return true;
    }
    public boolean des(int[] nums) {
        int n=nums.length;
        int i=0,j=i+1;
       
        while(j<n && i<j){
            if(nums[i]<nums[j]){
                return false;
                 
            } 
            else{
                i++;
                j++;
            } 
              
        }
       return true;
    }

    
    public boolean isMonotonic(int[] nums) {
      return asc(nums) || des(nums);
}
}