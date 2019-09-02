package algorithm;

import java.util.*;

public class Algo_2798 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		int k = 0;
		for(int i=1;i<n;i++) {
			k += i;
		}
		int[] a2 = new int[k];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		int temp=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				for(int p=0;p<n;p++) {
					if(p!=i && p!=j && i!=j) {
						if(Math.abs(sum-m)>Math.abs(a[i]+a[j]+a[p]-m)) {
							if(a[i]+a[j]+a[p]<=m) {
								sum = a[i]+a[j]+a[p];
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
		
		s.close();
	}
}
