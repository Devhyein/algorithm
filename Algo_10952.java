package algorithm;

import java.util.*;

public class Algo_10952 {
	public static void main(String[] args) {
		int A,B;
		Scanner s = new Scanner(System.in);
		while(true) {
			A=s.nextInt();
			B=s.nextInt();
			if(A==0 && B==0) {
				break;
			}
			System.out.println(A+B);
		}
		s.close();
	}
}
