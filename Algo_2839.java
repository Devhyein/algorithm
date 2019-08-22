package algorithm;

import java.util.*;
public class Algo_2839 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int minNum=10000;
		int cnt3 = N/3;
		int cnt5 = N/5;
		
		for(int i=0;i<=cnt3;i++) {
			for(int j=0;j<=cnt5;j++) {
				if(3*i+5*j==N) {
					if(i+j<minNum) {
						minNum = i+j;
					}
				}
			}
		}
		if(minNum == 10000) {
			System.out.println(-1);
		}else
			System.out.println(minNum);
		s.close();
	}
}
