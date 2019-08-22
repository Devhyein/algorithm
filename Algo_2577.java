package algorithm;

import java.util.*;

public class Algo_2577 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A,B,C;
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		int[] cnt = new int[10];
		int mul = A*B*C;
		
		while(true) {
			if(mul/10==0) {
				cnt[mul%10]++;
				break;
			}
			cnt[mul%10]++;
			mul = mul/10;
		}
		for (int i=0;i<10;i++) {
			System.out.println(cnt[i]);
		}
		s.close();
	}
}
