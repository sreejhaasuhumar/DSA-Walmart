package Walmart;

import java.util.Comparator;
import java.util.PriorityQueue;

public class NthSmallestwithKthBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4,k=2;
		long ans=getSmallestNumber(n, k);
		System.out.println(ans);
	}
	
	private static long getSmallestNumber(int n, int k) {
		long M = 1;
		PriorityQueue pq = new PriorityQueue(Comparator.reverseOrder());
		while (true) {
		if (Long.bitCount(M) == k) {
		// System.out.println("M=" + M + " bits=" + bitcount);
		if (pq.size() == n) break;
		else pq.add(M);
		}
		M++;
		}
		return (long) pq.poll();
		}

}
