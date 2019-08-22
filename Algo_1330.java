package algorithm;

import java.util.*;

public class Algo_1330 {
	public static void main(String[] args) {
		int A,B;
		Scanner s = new Scanner(System.in);
		A=s.nextInt();
		B=s.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		s.close();
	}
}
