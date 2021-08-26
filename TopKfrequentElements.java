package Walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKfrequentElements {

	public static void main(String[] args) {

		int[] nums = {1,1,1,2,2,3};
		int k=2;
		Integer[] ans=topKFrequent(nums,k);
		System.out.println(Arrays.toString(ans));
		
	}

         public static Integer[] topKFrequent(int[] nums, int k) {
           Map<Integer,Integer> map=new HashMap<>();
           List<Integer> list=new ArrayList<>();

           for (int i=0;i<nums.length;i++)
           {
               map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

           }
           
           for (var entry : map.entrySet()) {
        	   if(entry.getValue() >= 2)        	       		  
        		 list.add(entry.getKey());        	   
        	}
           Integer ans[]=new Integer[list.size()];
            return list.toArray(ans);
            }
}
