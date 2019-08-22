package algorithm;

import java.util.*;
//¦�� n�� �Է¹ް� �� �Ҽ��� ���ϸ� ¦�� n�� ������ �� �Ҽ��� ���϶�
//�Ҽ��� �ѽ��̻� ���� ��� �� �Ҽ��� ���� ������ ��

//n/2�� �������� ���� �ϳ��� 1�� �۾����� �ϳ��� 1�� Ŀ���� �Ѵٸ�
//�� ���� ���� �׻� n�̵ǰ�, �Ѵ� �Ҽ��ϰ�� ���� ó�� ������ �� �Ҽ��� �׻� �Ҽ����� ���� ���� ���� ���� ��
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
