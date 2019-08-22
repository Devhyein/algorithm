package algorithm;

import java.util.*;
//짝수 n을 입력받고 두 소수를 더하면 짝수 n이 나오는 두 소수를 구하라
//소수가 한쌍이상 나올 경우 두 소수의 차가 적은게 답

//n/2를 기준으로 수를 하나는 1씩 작어지고 하나는 1씩 커지게 한다면
//두 수의 합은 항상 n이되고, 둘다 소수일경우 제일 처음 구해진 두 소수가 항상 소수간의 차가 제일 적은 답이 됨
public class Algo_9020 {
	public static boolean primeNumber(int k) {
		for(int i=2;i<=Math.sqrt(k);i++) {
			if(k%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int left = n/2;
			int right = n/2;
			
			while(true) {
				if(primeNumber(left))
					if(primeNumber(right))
						break;
				left--;
				right++;
			}
			System.out.println(left+" "+right);
		}
		s.close();
	}
}
