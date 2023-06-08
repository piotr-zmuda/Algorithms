public class LeetCode {
    public static void main(String[] args) {
        System.out.println("====================== TASK 1 ==============================");
        /*You are given an integer array nums consisting of n elements, and an integer k.
        Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
        Any answer with a calculation error less than 10-5 will be accepted.*/
        int[] nums = new int[]{1,12,-5,-6,50,3};
        System.out.println(maximumAverageSubarray(nums,4));

        System.out.println("====================== TASK 2 ==============================");
        /*Max Consecutive Ones III*/
        /*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.*/
        /*Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
        Output: 6
        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.*/
        int[] nums2 = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums,2));

        System.out.println("====================== TASK 3 ==============================");
    }
    public static double maximumAverageSubarray(int[] nums, int k){
        double curr=0;
        int index=0;
        double res;
        for(int i=0;i<k;i++){
            curr+=nums[i];
        }
        res = curr/k;
        for(int i=1;i<nums.length-(k-1);i++){
            curr = curr - nums[index] + nums[k+i-1];
            if((curr/k)>res){
                res=(curr/k);
            }
            index++;
        }
        return res;
    }

    public static int longestOnes(int[] nums, int k) {
        int howManyZeros=0;
        int ans=0;
        int count=0;
        int i=0;
        int left=0;
        while(i<=nums.length-1){
            if(nums[i]==0){
                howManyZeros++;
            }
            if(howManyZeros>k){
                if(ans<count){
                    ans=count;
                }
                while(howManyZeros>k){
                    if(nums[left]==0){
                        howManyZeros--;
                        count--;
                    }else{
                        count--;
                    }
                    left++;
                }
            }
            count++;
            i++;
        }
        if(ans==0 || ans<count){
            return count;
        }
        return ans;
    }
}
