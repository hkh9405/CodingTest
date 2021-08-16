package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num10809 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<>();
		
		String[] word=sc.next().split("");
		
		for(int i=0;i<word.length;i++) {
			map.put(word[i], map.getOrDefault(word[i], i));
		}
		
		char ch;
		String a;
		for(ch=97;ch<=122;ch++) {
			a=String.valueOf(ch);
			map.put(a, map.getOrDefault(a, -1));
			
			System.out.print(map.get(a)+" ");
		}
	}

}
