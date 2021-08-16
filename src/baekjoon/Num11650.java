package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Num11650 {
	
	public static int[] src;	
	public static int[] tmp;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		String[] s=new String[N];
		Map<String, Integer> x=new HashMap<String, Integer>();
		Map<String, Integer> y=new HashMap<String, Integer>();
		
		for(int i=0;i<N;i++) {
			s[i]=br.readLine();
			
			x.put(s[i], Integer.parseInt(s[i].split(" ")[0]));
			y.put(s[i], Integer.parseInt(s[i].split(" ")[1]));
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(s[i]);
		}
	}

	
	public static void mergeSort(int start, int end) { 
		if (start<end) { 
			int mid = (start+end)/2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			
			int p = start;
			int q = mid + 1;
			int idx = p;
			
			while (p<=mid || q<=end) {
				if (q>end || (p<=mid && src[p]<src[q])) { 
					tmp[idx++] = src[p++]; 
				}else { 
					tmp[idx++] = src[q++];
				} 
			}
			
			for (int i=start;i<=end;i++) {
				src[i]=tmp[i]; 
			}
		}
	}
	
}
