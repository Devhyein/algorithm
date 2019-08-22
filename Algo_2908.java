package algorithm;

import java.util.*;

public class Algo_2908 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		int aa=0, bb=0;
		int[] tempA = new int[3];
		int[] tempB = new int[3];
		a = s.nextInt();
		b = s.nextInt();
		
		for(int i=0;i<3;i++) {
			tempA[i]=a%10;
			a/=10;
			tempB[i]=b%10;
			b/=10;	
		}
		for(int i=0;i<3;i++) {
			aa += tempA[i]*Math.pow(10, 2-i);
			bb += tempB[i]*Math.pow(10, 2-i);
		}
		
		if(aa>bb) {
			System.out.println(aa);
		}
		else {
			System.out.println(bb);
		}
		s.close();
	}
}
