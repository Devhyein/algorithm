package algorithm;

import java.util.*;

public class Algo_3052 {
	public static void main(String[] args) {
		int a;
		int[] remainder = new int[42];
		int cnt = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			a = s.nextInt();
			remainder[a%42]++;
		}
		for(int i=0;i<42;i++) {
			if(remainder[i] != 0)
				cnt++;
		}
		System.out.println(cnt);
		s.close();
	}
}
