package algorithm;

import java.util.*;

public class Algo_1546 {
	public static void main(String[] args) {
		int M=0;
		double avg;
		int n;
		double sum=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] score = new int[n];
		double[] new_score = new double[n];
		for(int i=0;i<n;i++) {
			score[i] = s.nextInt();
			if(score[i]>M) {
				M = score[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			new_score[i] = (double)score[i]/(double)M*100;
			sum+=new_score[i];
		}
		System.out.println(sum/n);
		s.close();
	}
}
