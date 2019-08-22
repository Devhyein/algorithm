package algorithm;

import java.util.*;

public class Algo_1316 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int cnt = N;
		
		for(int i=0;i<N;i++) {
			boolean[] alpha = new boolean[26];
			String in = s.next();
			alpha[in.charAt(0)-97] = true;
			for(int j=1;j<in.length();j++) {
				if(alpha[in.charAt(j)-97]==true) {
					if(in.charAt(j-1) != in.charAt(j)) {
						cnt--;
						break;
					}
				}
				alpha[in.charAt(j)-97] = true;
			}
		}
		System.out.println(cnt);
		s.close();
	}
}
