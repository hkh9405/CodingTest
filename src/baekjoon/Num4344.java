package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int C=Integer.parseInt(br.readLine());
		int[] score;
		int total;
		double result,count,avg;
		int student;
		
		for(int i=0;i<C;i++) {
			StringTokenizer str=new StringTokenizer(br.readLine(), " ");
			student=Integer.parseInt(str.nextToken());
			score=new int[student];
			total=0;
			count=0;
			
			for(int j=0;j<student;j++) {
				score[j]=Integer.parseInt(str.nextToken());
				
				total+=score[j];
			}

			avg=total/student;
			
			for(int k=0;k<student;k++) {
				if(score[k]>avg) {
					count++;
				}
			}

			result=count/student*100;
			
			System.out.printf("%.3f%%\n",result);
		}
		
		br.close();
	}

}
