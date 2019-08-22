package algorithm;

import java.util.*;

public class Algo_11720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		int N = s.nextInt();
		String in = s.next();
		
		for (int i=0;i<N;i++) {
			char input = in.charAt(i);
			int k = Integer.parseInt(Character.toString(input));
			sum += k;
		}
		System.out.println(sum);
		s.close();
	}
	
}
