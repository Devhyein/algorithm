package algorithm;

import java.util.*;

public class ALgo_7568 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] k = new int[n];
		
		for(int i=0;i<n;i++) {
			x[i]=s.nextInt();
			y[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			k[i]=1;
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				if(x[j]>x[i] && y[j]>y[i]) {
					k[i]++;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(k[i]+" ");
		s.close();
	}
}
