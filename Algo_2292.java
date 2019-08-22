package algorithm;

import java.util.*;

public class Algo_2292 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		long sum = 1;
		
		long i = 1;
		while(true) {
			sum+=6*(i-1);
			if(n <= sum) {
				break;
			}
			i++;
		}
		System.out.println(i);
		s.close();
	}
}
