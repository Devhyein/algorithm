package algorithm;


import java.util.*;

public class Algo_2884 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour;
		int min;
		int fixed_hour;
		int fixed_min;
		hour = s.nextInt();
		min = s.nextInt();
		
		if(min>=45) {
			fixed_hour = hour;
			fixed_min = min - 45;
		}else {
			if(hour==0) {
				fixed_hour = 23;
			}else {
				fixed_hour = hour-1;
			}
			fixed_min = min+15;
		}
		System.out.println(fixed_hour+" "+fixed_min);
		s.close();
	}
}
