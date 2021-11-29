package Walmart;

import java.util.HashMap;

public class HexadecimalModulus {
		 
	    // Function to calculate modulus of
	    // two Hexadecimal numbers
	    static void hexaModK(String N, String k)
	    {
	        // Store all possible
	        // hexadecimal digits
	        HashMap<Character, Integer> map
	            = new HashMap<>();
	 
	        // Iterate over the range ['0', '9']
	        for (char i = '0'; i <= '9'; i++) {
	            map.put(i, i - '0');
	        }
	        map.put('A', 10);
	        map.put('B', 11);
	        map.put('C', 12);
	        map.put('D', 13);
	        map.put('E', 14);
	        map.put('F', 15);
	 
	        // Convert given string to long
	        long m = Long.parseLong(k, 16);
	 
	        // Base to get 16 power
	        long base = 1;
	 
	        // Store N % K
	        long ans = 0;
	 
	        // Iterate over the digits of N
	        for (int i = N.length() - 1;
	            i >= 0; i--) {
	 
	            // Stores i-th digit of N
	            long n
	                = map.get(N.charAt(i)) % m;
	 
	            // Update ans
	            ans = (ans + (base % m * n % m) % m) % m;
	 
	            // Update base
	            base = (base % m * 16 % m) % m;
	        }
	 
	        // Print the answer converting
	        // into hexadecimal
	        System.out.println(
	            Long.toHexString(ans).toUpperCase());
	    }
	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        // Given string N and K
	        String n = "3E8";
	        String k = "13";
	 
	        // Function Call
	        hexaModK(n, k);
	    }
	}


