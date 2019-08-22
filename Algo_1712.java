package algorithm;

import java.util.*;


public class Algo_1712 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		
		if(c<=b) {
			System.out.println(-1);
			return;
		}
		
		long n = 1;
		while(true) {
			if(c*n > a + b*n)
				break;
			n++;
		}
		System.out.println(n);
		s.close();
	}
}
