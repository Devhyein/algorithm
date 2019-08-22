package algorithm;

import java.util.*;

public class Algo_10872 {
	public static void main(String[] args) {
		int result=1;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			result = result*i;
		}
		System.out.println(result);
		s.close();
	}
}
