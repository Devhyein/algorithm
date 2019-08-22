package algorithm;

import java.util.*;

public class Algo_1065 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int cnt = 0;
		for (int i=1;i<=n;i++) {
			if(i<100) {
				cnt++;
			}else {
				boolean flag = true;
				int j = i;
				int k=0;
				int[] tmp = new int[1001];
				do {
					tmp[k++]=j%10;
					j=j/10;
				}while(j!=0);
				int diff = tmp[1]-tmp[0];

				for (int p=1;p<k;p++) {
					if(tmp[p]-tmp[p-1] != diff) {
						flag = false;
					}
				}
				if(flag == true) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
