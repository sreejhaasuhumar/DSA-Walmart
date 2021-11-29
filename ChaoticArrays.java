package Walmart;

public class ChaoticArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {4,3,9,17};
		int ans=getCount(a);
		System.out.println(ans);
		
	}
	
	public static int getCount(int[] a) {
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			double sqrt=Math.sqrt(a[i]);   

			if((sqrt - Math.floor(sqrt)) == 0) {
				a[i]=1;
			}
			else
			{
				a[i]=0;
			}
			
		}
		
		
	return 0;
	}

}
