package algorithm;

import java.util.*;

public class Algo_2675 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int n;
		String in;
		for(int i=0;i<T;i++) {
			n = s.nextInt();
			in = s.next();
			for(int k=0;k<in.length();k++) {
				for(int j=0;j<n;j++) {
					System.out.print(in.charAt(k));
				}
			}
			System.out.print("\n");
		}
		s.close();
	}
}
