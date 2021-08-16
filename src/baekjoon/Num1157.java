package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Num1157 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		HashMap<String, Integer> map=new HashMap<String, Integer>();
		String[] word=sc.next().toUpperCase().split("");

		for(int i=0;i<word.length;i++) {
			map.put(word[i], map.getOrDefault(word[i], 0)+1);
		}

		String[] key=new String[map.size()];
		int[] count=new int[map.size()];
		int a=0;

		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			key[a]=it.next();
			count[a]=map.get(key[a]);
			a++;
		}

		Arrays.sort(count);

		if(count.length==1) {
			System.out.println(key[0]);
		}else {
			if(count[count.length-1]==count[count.length-2]) {
				System.out.println("?");
			}else {
				String result=(String) Num1157.getKey(map, count[count.length-1]);
				System.out.println(result);
			}
		}

	}
	
	public static Object getKey(HashMap<String,Integer> map, Object value) {
		for(Object o: map.keySet()) {
			if(map.get(o).equals(value)) {
				return o; 
			} 
		} 
		return null; 
	}

}
