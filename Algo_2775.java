package algorithm;

import java.util.*;

public class Algo_2775 {
	public static int downfloor(int k, int n) {
		int sum = 0;
		if(k<0)
			return 0;
		else if(k==0) {
			for(int i=1;i<=n;i++) {
				sum += i;
			}
		}else {
			for(int i=1;i<=n;i++) {
				sum += downfloor(k-1,i);
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		for(int i=0;i<T;i++) {
			int k = s.nextInt();
			int n = s.nextInt();
			int sum = 0;
			
			sum += downfloor(k-1,n);
			System.out.println(sum);
		}
		s.close();
	}
}
