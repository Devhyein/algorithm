package algorithm;

import java.util.*;

public class Algo_2562 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int index=-1;
		int max = 0;
		int a;
		for (int i=0;i<9;i++) {
			a = s.nextInt();
			if(a>max) {
				max = a;
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
		s.close();
	}
}
