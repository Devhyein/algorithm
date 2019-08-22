package algorithm;

import java.util.*;

public class Algo_2581 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int sum = 0;
		int min = 10000;
		
		for(int i=m;i<=n;i++) {
			boolean flag = true;
			if(i==1)
				flag = false;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				sum += i;
				if(min>i)
					min = i;
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		s.close();
	}
}
