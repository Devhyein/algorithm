package algorithm;

import java.util.*;

public class Algo_1931 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] meeting = new int[n][2];
		int cnt = 0;
		int[] room = new int[n];
		
		for(int i=0;i<n;i++) {
			meeting[i][0] = s.nextInt();
			meeting[i][1] = s.nextInt();
		}
		Arrays.sort(meeting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
		for(int i=1;i<n;i++) {
			if(meeting[i][1]==meeting[i-1][1]) {
				if(i==n-1)
					break;
				while(meeting[i][1]==meeting[i-1][1]) {
					if(meeting[i][0]<meeting[i-1][0]) {
						int tmp;
						tmp = meeting[i][0];
						meeting[i][0]=meeting[i-1][0];
						meeting[i-1][0]=tmp;
					}
					i++;
				}
			}
		}
		room[0] = 0;
		cnt++;
		for(int i=1;i<n;) {
			if(meeting[room[cnt-1]][1]>meeting[i][0]) {
				i++;
			}
			else {
				room[cnt++] = i;
				i++;
			}
		}
		
		System.out.println(cnt);
	}
}
