package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Num1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str=br.readLine().split(" ");
		int x=Integer.parseInt(str[0]);
		int y=Integer.parseInt(str[1]);
		int w=Integer.parseInt(str[2]);
		int h=Integer.parseInt(str[3]);
		
		int[] length= {w-x,h-y,x,y};
		
		Arrays.sort(length);
		
		bw.write(length[0]+"\n");
		bw.flush();
		
		br.close();
		bw.close();
	}

}
