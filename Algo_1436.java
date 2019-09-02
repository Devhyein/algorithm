package algorithm;

import java.util.*;

public class Algo_1436 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] title = new int[10000000];
		int cnt=1;
		for(int i=666;i<10000999;i++) {
			int flg=0;
			int tmp=i;
			while(tmp>0) {
				if(tmp%10==6) {
					flg++;
					tmp/=10;
				}
				else {
					flg=0;
					tmp/=10;
				}
				if(flg==3) {
					title[cnt++]=i;
					break;
				}
			}
			
		}
		System.out.println(title[n]);
		s.close();
	}
}
