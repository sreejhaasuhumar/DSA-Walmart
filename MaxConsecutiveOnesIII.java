package Walmart;

public class MaxConsecutiveOnesIII {
/*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int ans=findMax(nums, k);
		System.out.println(ans);
	}
	
	public static int findMax(int nums[],int k) {
		int start=0,end=0,k1=0,max=0;
		k1=k;
		while(end<nums.length)
		{
			if(nums[end]==1)
			{
				end++;
			}
			else if(nums[end]==0)
			{
				if(k1>0)
				{
					k1--;
					end++;
				}
				else if(k1==0) {
					while(k1==0)
					{
						if(nums[start]==0)
						k1++;
						start++;

					}

				}
			}

			
			max=Math.max(max, end-start);
		}
		return max;
	}

	
	 public static int longestOnes(int[] A, int K) {
		 /*For each A[j], try to find the longest subarray.
If A[i] ~ A[j] has zeros <= K, we continue to increment j.
If A[i] ~ A[j] has zeros > K, we increment i (as well as j).*/
		 int i = 0, j;
	        for (j = 0; j < A.length; ++j) {
	            if (A[j] == 0) K--;
	            if (K < 0 && A[i++] == 0) K++;
	        }
	        return j - i;	       
	    }
}
