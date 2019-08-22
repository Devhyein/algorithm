package algorithm;

import java.util.*;

public class Algo_10250 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=0;i<T;i++) {
			int h = s.nextInt();
			int w = s.nextInt();
			int n = s.nextInt();
			
			int floor,room;
			
			floor = n%h;
			if(floor == 0) {
				floor = h;
			}
			room = (int)(n-0.001)/h+1;
		
			System.out.println(floor*100+room);
		}
		s.close();
	}
}
