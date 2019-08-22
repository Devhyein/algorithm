package algorithm;

import java.util.*;

public class Algo_2753 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		year = s.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else {
				System.out.println("1");
			}
		}else {
			System.out.println("0");
		}
		s.close();
	}
}
