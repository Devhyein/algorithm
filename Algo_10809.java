package algorithm;

import java.util.*;

public class Algo_10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int[] alpha = new int[26];
		
		for(int i=0;i<26;i++) {
			alpha[i] = -1;
		}
		
		for (int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			//String a = Character.toString(s.charAt(i));
			for(int j=0;j<26;j++) {
				if(a == ((char)(97+j))) {
					if(alpha[j] == -1) {
						alpha[j] = i;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
	}
}
