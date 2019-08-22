package algorithm;

import java.util.*;
//�Ҽ����ϴ� ����
//���� �Ҽ��� 2~��Ʈ(n)������ �˻��ϸ� ��
public class Algo_4948 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int n = s.nextInt();
			if(n == 0)
				break;
			
			int cnt = 0;
			
			for(int i=n+1;i<=2*n;i++) {
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
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		s.close();
	}
}
