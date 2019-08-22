package algorithm;

import java.util.*;

public class Algo_10818 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int a;
		int max=-1000000;
		int min=1000000;
		for(int i=0;i<n;i++) {
			a = s.nextInt();
			if (a>max)
				max = a;
			if (a<min)
				min = a;
		}
		System.out.println(min+" "+max);
		s.close();
	}
}
