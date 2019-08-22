package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Algo_2869 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str;
		try {
			str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);
		
		int day = 0;
		int height = 0;
		
		if((v-a)%(a-b)==0) {
			day = (v-a)/(a-b);
		}else {
			day = (v-a)/(a-b)+1;
		} // == math.ceil((v-a)/(a-b))
		day++; //1일부터 시작이니까 +1
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
