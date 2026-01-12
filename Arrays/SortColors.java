class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid =0;
        int high = nums.length-1;
        

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                int temp =nums[mid];
                nums[mid] = nums[high];
                nums[high] =temp;

                high--; 
            }
        }

        // int low =0;
        // int mid =0;
        // int high=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0)
        //         low++;
        //     else if(nums[i]==1)
        //         mid++;
        //     else if(nums[i]==2)
        //         high++;
        // }
        // int indx = 0;
        //  for(int l=0; l<low; l++)
        //         nums[indx++] = 0;
        //     for(int j = 0; j<mid; j++)
        //         nums[indx++] = 1;
        //     for(int k = 0; k<high; k++)
        //         nums[indx++] = 2;
            // for(int l=0; l<low; l++)
            //     nums[l] = 0;
            // for(int j = low; j<low + mid; j++)
            //     nums[j] = 1;
            // for(int k = mid+high; k<nums.length; k++)
            //     nums[k] = 2;
    }
}
