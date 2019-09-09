package algorithm;

import java.util.*;

public class Algo_11047 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		int cnt = 0;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		int i=n-1;
		while(sum<k) {
			while(sum+a[i]<=k) {
				cnt++;
				sum+=a[i];
			}
			i--;
			if(i<0)
				break;
		}
		
		
		System.out.println(cnt);
	}
}
