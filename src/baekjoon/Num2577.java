package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A=Integer.parseInt(br.readLine());
		int B=Integer.parseInt(br.readLine());
		int C=Integer.parseInt(br.readLine());
		
		String result=Integer.toString(A*B*C);

		int[] count=new int[10];
		int num;
		
		for(int i=0;i<result.length();i++) {
			num=result.charAt(i)-'0';
			
			for(int j=0;j<10;j++) {
				if(num==j) {
					count[j]++;
				}
			}
		}
		
		for(int i=0;i<10;i++) {		
			bw.write(String.valueOf(count[i]));
			bw.newLine();
		}
		
		br.close();
		bw.close();
		
	}

}
