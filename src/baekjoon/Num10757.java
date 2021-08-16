package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Num10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] str=br.readLine().split("\\s");
		BigInteger result = new BigInteger(str[0]).add(new BigInteger(str[1]));
		
		System.out.println(result);
	}

}
