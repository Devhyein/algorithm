package algorithm;

import java.util.*;

public class Algo_1193 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long x = s.nextLong();
		
		long i = 0;
		long sum = 0;
		long prevSum = 0;
		long sum_of_Fraction;
		long parent, child;
		
		while(true) {
			prevSum = sum;
			sum += i;
			if(sum>=x) {
				sum_of_Fraction=i+1;
				
				//Ȧ������ ���̸� �и� 1�ΰ� ����
				if(i%2!=0) {
					parent = x-prevSum;
					child = sum_of_Fraction - parent;
					System.out.println(child+"/"+parent);
					break;
				}else {//¦����° ���̸� ���ڰ� 1�ΰ� ����
					child = x-prevSum;
					parent = sum_of_Fraction - child;
					System.out.println(child+"/"+parent);
					break;
				}
				
				
			}
			i++;
		}
		s.close();
	}
}
