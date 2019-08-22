package algorithm;

import java.util.*;

public class Algo_4153 {
	public static boolean rightTriangle(int a,int b,int c) {
		if (a>b && a>c) {
			if(Math.pow(a, 2) == Math.pow(b, 2)+Math.pow(c, 2))
				return true;
			else
				return false;
		}else if(b>a && b>c) {
			if(Math.pow(b, 2) == Math.pow(a, 2)+Math.pow(c, 2))
				return true;
			else
				return false;
		}else {
			if(Math.pow(c, 2) == Math.pow(b, 2)+Math.pow(a, 2))
				return true;
			else
				return false;
		}
			
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int a,b,c;
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			if(a == 0 && b == 0 && c == 0)
				break;
			
			if(rightTriangle(a,b,c))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		s.close();
	}
}
