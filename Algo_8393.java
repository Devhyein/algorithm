package algorithm;

import java.util.*;

public class Algo_8393 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		s.close();
	}
}
