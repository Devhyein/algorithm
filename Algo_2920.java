package algorithm;

import java.util.*;

public class Algo_2920 {
	public static void main(String[] args) {
		int[] a = new int[8];
		String[] result = {"ascending","descending","mixed"};
		String type;
		Scanner s = new Scanner(System.in);
		a[0] = s.nextInt();
		a[1] = s.nextInt();
		if(a[0]<a[1]) {
			type = result[0];
		}else {
			type = result[1];
			}
		for (int i=2;i<8;i++) {
			a[i] = s.nextInt();
			if(a[i]>a[i-1]) {
				if(type.equals("descending")) {
					type = result[2];
					break;
				}
			}else {
				if(type.equals("ascending")) {
					type = result[2];
					break;
				}
			}
		}
		System.out.println(type);
		s.close();
		
	}
}
