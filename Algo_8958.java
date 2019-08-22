package algorithm;

import java.util.*;

public class Algo_8958 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			int conti=1;
			int total_score=0;
			
			String input;
			input = s.nextLine();
			char[] score = new char[input.length()];
			for(int j=0;j<score.length;j++){
				score[j] = input.charAt(j);
			}
			for(int j=0;j<score.length;j++) {
				if(Character.toString(score[j]).equals("O")) {
					total_score+=conti;
					conti++;
				}else {
					conti=1;
				}
			}
			System.out.println(total_score);
		}
		s.close();
	}
}
