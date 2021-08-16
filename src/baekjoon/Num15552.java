package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			String[] str=br.readLine().split(" ");
			
			bw.write(Integer.parseInt(str[0])+Integer.parseInt(str[1])+"\n");
		}
		
		bw.close();	
	}

}
