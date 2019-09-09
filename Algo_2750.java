package algorithm;

import java.util.*;

public class Algo_2750 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] k = new int[n];
		for(int i=0;i<n;i++) {
			k[i] = s.nextInt();
		}
		
		Arrays.sort(k);
		for(int i=0;i<n;i++)
			System.out.println(k[i]);
		s.close();
	}
}
