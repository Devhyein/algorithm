package algorithm;

import java.util.*;
//�Ҽ����ϴ� ����
//���� �Ҽ��� 2~��Ʈ(n)������ �˻��ϸ� ��
public class Algo_1929 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		for(int i=m;i<=n;i++) {
			boolean flag = true;
			if(i==1)
				flag=false;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(i);
			}
		}
		s.close();
	}
}
