package algorithm;

import java.util.Scanner;

public class farm {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int n=input.nextInt();
		int w=input.nextInt();
		
		int cnt=0;
		int p= 0;
		int q=0;
	
		for (int i=1;i<n;i++) {
			int x=i;
			int y=n-i;
			if(a*x+b*y==w) {
				p=x;
				q=y;
				cnt++;
				
			}
			
		}
		
		if(cnt==1) {
			if(p<q)
				System.out.println(p+" "+q);
			else
				System.out.println(q+" "+p);
		}
		else if(cnt>1 || cnt ==0)
			System.out.print(-1);
	}
	
}
