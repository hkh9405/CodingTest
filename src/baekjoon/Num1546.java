package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer str=new StringTokenizer(br.readLine(), " ");
		
		double[] score=new double[N];
		for(int i=0;i<N;i++) {
			score[i]=Integer.parseInt(str.nextToken());
		}
		
		Arrays.sort(score);
		
		double result=0;
		for(int i=0;i<N;i++) {
			result+=(score[i]/score[N-1]*100);
		}
		result/=N;
		
		bw.write(String.valueOf(result));
		
		bw.close();
		br.close();
	}

}
