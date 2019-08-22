package algorithm;

import java.util.*;

public class Algo_3009 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a1 = new int[2];
		a1[0] = s.nextInt();
		a1[1] = s.nextInt();
		int[] a2 = new int[2];
		a2[0] = s.nextInt();
		a2[1] = s.nextInt();
		int[] a3 = new int[2];
		a3[0] = s.nextInt();
		a3[1] = s.nextInt();
		
		int x,y;
		
		if(a1[0]==a2[0]) {
			x=a3[0];
			if(a1[1]==a3[1])
				y=a2[1];
			else 
				y=a1[1];
		}else if(a1[0]==a3[0]){
			x=a2[0];
			if(a1[1]==a2[1])
				y=a3[1];
			else 
				y=a1[1];
		}else {
			x=a1[0];
			if(a1[1]==a3[1])
				y=a2[1];
			else 
				y=a3[1];
		}	
		System.out.println(x+" "+y);
		s.close();
	}
}
