package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Num3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] remainder=new int[10];
		
		int num;
		for(int i=0;i<10;i++) {
			num=Integer.parseInt(br.readLine());
			remainder[i]=num%42;
		}
		
		int result=10;
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(remainder[i]==remainder[j]) {
					result--;
					break;
				}
			}
		}
		
		bw.write(String.valueOf(result));
		
		bw.close();
		br.close();
	}

}

class other {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<10;i++) {
			hs.add(Integer.parseInt(br.readLine())%42);
		}
		
		bw.close();
		br.close();
		
		System.out.println(hs.size());
	}

}
