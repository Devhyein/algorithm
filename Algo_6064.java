package algorithm;

import java.util.*;

public class Algo_6064 {
	public static int find_lcm(int val1,int val2) {
		int lcm;
		int r=1;
		int tmp1=val1,tmp2=val2;//�ּҰ������ ���ϱ� ���� �Է¹��� �� ����
	        if(val1<val2){//2��° �Է¼��� Ŭ ��� ū���� val1���� ����
	            val1 = tmp2;
	            val2 = tmp1;
	         }
	 
	         while(r>0){//��Ŭ���� ȣ������ �̿��� GCD(�ִ�����)���ϱ�
	             r = val1 % val2;
	             val1 = val2;
	             val2 = r;
	          }
	    lcm = tmp1*tmp2/val1;
		return lcm;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=0;i<T;i++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			int k = -1;
			int diff = m-n;
			int min_loop = find_lcm(m,n)/m;
			int[] arr = new int[min_loop];

			int temp = x;
			
			for(int j=0; j<min_loop; j++) {
				if(temp%n==0) {
					arr[j] = n;
				}else {
					arr[j]= temp%n;
				}
				
				temp = arr[j] + m;
				
				if(arr[j] == y) {
					k = m*j+x;
					break;
				}
			}
			System.out.println(k);
		}
		s.close();
	}
}
