package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		
		int max=0;
		int num;
		
		for(int i=1;i<=9;i++) {
			num=Integer.parseInt(br.readLine());
			
			if(num>max) {
				max=num;
			}
			
			m.put(num, i);
		}
		
		System.out.print(max+"\n"+m.get(max));

		bw.close();
		br.close();
	}
	
}
