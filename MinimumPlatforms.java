package Walmart;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MinimumPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] at= {900, 940, 950, 1100, 1500, 1800};
		int[] dt= {910 ,1200, 1120, 1130, 1900, 2000};
		int ans=calculateMinPatforms(at, dt);
	}
	
	 public static int calculateMinPatforms(int at[], int dt[]) {
	        // Write your code here.
	        Map<Integer,String> map=new TreeMap<>();
	        for(int i=0;i<at.length;i++)
	        {
	            map.put(at[i],"A");
	        }
	        for(int i=0;i<dt.length;i++)
	        {
	            map.put(dt[i],"D");
	        }
	        int count=0,max=0;
	        for(Map.Entry<Integer, String> entry:map.entrySet())
	        {
	            if(entry.getValue()=="A")
	                count++;
	            else
	                count--;
	            max=Math.max(max,count);
	        }
	        
	        return max;
	    }

}
