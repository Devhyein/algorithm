package algorithm;

import java.util.*;

public class Algo_1110 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int left,right;	
		int n = s.nextInt();
		int sum;
		int cnt=0;
		
		if(n<10) {
			left = 0;
			right = n;
		}else {
			left = n/10;
			right = n%10;
		}
		
		do {
			cnt++;
			sum = left+right;
			left = right;
			if(sum<10) {
				right = sum;
			}else {
				right = sum%10;
			}		
		}while(left*10+right != n);
		System.out.println(cnt);
		s.close();
	}
}
