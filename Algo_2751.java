package algorithm;

import java.util.*;

public class Algo_2751 {
	int[] sorted = new int[100000];
	
	public static void merge(int[] list, int left, int mid, int right) {
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int tmp;
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();	
		}
		
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			//swap(arr,min,i);
		}
	
		
		
		for(int  i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		s.close();
	}
}
