package algorithm;

import java.util.*;

public class Algo_6064 {
	public static int find_lcm(int val1,int val2) {
		int lcm;
		int r=1;
		int tmp1=val1,tmp2=val2;//최소공배수를 구하기 위해 입력받은 값 저장
	        if(val1<val2){//2번째 입력수가 클 경우 큰수를 val1으로 변경
	            val1 = tmp2;
	            val2 = tmp1;
	         }
	 
	         while(r>0){//유클리드 호제법을 이용한 GCD(최대공약수)구하기
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
