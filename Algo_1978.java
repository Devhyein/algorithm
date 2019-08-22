package algorithm;

import java.util.*;

public class Algo_1978 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a;
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			a = s.nextInt();
			if(a == 1) {
				cnt++;
				continue;
			}
			for(int j=2;j<a;j++) {
				if(a%j == 0) {
					cnt++;
					break;	
				}
			}
		}
		System.out.println(n-cnt);
		s.close();
		
		
	}
}
