package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());

		String[] str;
		int count;
		int result;

		for(int j=0;j<T;j++) {
			str = br.readLine().split("");
			
			count=0;
			result=0;
			
			for(int i=0;i<str.length;i++) {
				if(str[i].equals("O")) {
					count++;
				} else {
					count=0;
				}

				if(i>0 && str[i-1]=="O" && str[i]=="O") {
					count++;
				}

				result+=count;
			}
			
			System.out.println(result);
		}

		br.close();
	}

}
