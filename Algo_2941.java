package algorithm;

import java.util.*;

public class Algo_2941 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String alpha = s.next();
		int cnt = 0;
		int i = 0;
		
		while(i<alpha.length()) {
			if (alpha.charAt(i) == 'c') {
				if(alpha.charAt(i+1) == '=') {
					cnt++;
					i++;
				}else if(alpha.charAt(i+1) == '-') {
					cnt++;
					i++;
				}
			}else if(alpha.charAt(i) == 'd'){
				if(alpha.charAt(i+1) == 'z') {
					if(alpha.charAt(i+2) == '=') {
						cnt+=2;
						i+=2;
					}
				}else if(alpha.charAt(i+1) == '-') {
					cnt++;
					i++;
				}
			}else if(alpha.charAt(i) == 'l') {
				if(alpha.charAt(i+1) == 'j') {
					cnt++;
					i++;
				}
			}else if(alpha.charAt(i) == 'n') {
				if(alpha.charAt(i+1) == 'j') {
					cnt++;
					i++;
				}
			}else if(alpha.charAt(i) == 's') {
				if(alpha.charAt(i+1) == '=') {
					cnt++;
					i++;
				}
			}else if(alpha.charAt(i) == 'z') {
				if(alpha.charAt(i+1) == '=') {
					cnt++;
					i++;
					
				}
			}
			i++;
		}
		System.out.println(alpha.length()-cnt);
		s.close();
	}
}
