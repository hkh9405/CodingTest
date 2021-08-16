package programmers.level1;

public class ReverseSort {

	public static int[] solution(long n) {
		String str=Long.toString(n);
		String[] PN=str.split("");
		
		int[] answer = new int[PN.length];
		int num=0;
		int j=0;
		
		for(int i=PN.length-1;i>=0;i--) {
			num=Integer.parseInt(PN[i]);
			
			answer[j]=num;
			j++;
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		long n=12345;
		
		for(int i:ReverseSort.solution(n)) {
			System.out.println(i);
		}
	}
}
