package Walmart;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

	public static void
    findSubsets(ArrayList<ArrayList<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index)
    {
      // Base Condition
        if (index == nums.size()) {
            subset.add(output);
            return;
        }
       
        // Not Including Value which is at Index
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
 
        // Including Value which is at Index
        output.add(nums.get(index));
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }
 
    public static void main(String[] args) {
       
      //Main List for storing all subsets
      ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
       
      // Input ArrayList
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(3);
       
      findSubsets(subset, input, new ArrayList<>(), 0);
    }
    
    
    
    ////////////////////////
    //Method 2
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
    	ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(ArrayList<ArrayList<Integer>> list , ArrayList<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

