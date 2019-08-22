package algorithm;

import java.util.*;

public class Algo_3053 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		System.out.printf("%.6f\n",Math.PI*Math.pow(r, 2));
		System.out.printf("%.6f",(double)2*r*r);
		s.close();
	}
}
