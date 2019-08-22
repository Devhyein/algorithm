package algorithm;

import java.util.*;

public class Algo_1157 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a;
		int[] arr = new int[26];
		a = s.next().toUpperCase();

		for (int i=0;i<a.length();i++) {
			arr[(int)a.charAt(i)-65]++;
		}
		
		int max = 0;
		int max_index=-1;
		boolean same = false;
		
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				same = false;
				max = arr[i];
				max_index = i;
			}else if(arr[i]==max) {
				same = true;
			}
		}
		if(same == true) {
			System.out.println("?");
		}else {
			System.out.println((char)(max_index+65));
		}
		s.close();
	}
}
