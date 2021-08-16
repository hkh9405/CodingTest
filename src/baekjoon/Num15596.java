package baekjoon;

public class Num15596 {

	public long sum(int[] a) throws Exception {
		long result=0;
		
		for(int i=0;i<a.length;i++) {
			result+=a[i];
		}
		
		return result; 
	}

}
