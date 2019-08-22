package algorithm;

import java.util.*;

public class Algo_4673 {
	public static void main(String[] args) {
		int[] cnt = new int[10001];
		for(int i=1;i<=10000;i++) {
			int num = i;
			int sum = i;
			do{
				sum+=num%10;
				num=num/10;
			}while(num!=0);
			if(sum>0 && sum<10001) {
				cnt[sum]++;
			}
		}
		for(int i=1;i<=10000;i++) {
			if(cnt[i]==0) {
				System.out.println(i);
			}
		}
	}
}
