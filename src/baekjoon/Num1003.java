package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num1003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n,num;
		int[] zero=new int[41];
		int[] one=new int[41];

		
		zero[0]=1;
		zero[1]=0;
		one[0]=0;
		one[1]=1;
		
		n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			num=Integer.parseInt(br.readLine());
			
			for(int j=2;j<=num;j++) {
				zero[j]=zero[j-1]+zero[j-2];
				one[j]=one[j-1]+one[j-2];
			}
			
			bw.write(zero[num]+" "+one[num]+"\n");
		}
		
		br.close();
		bw.close();
	}
}
