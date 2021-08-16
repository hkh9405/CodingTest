package programmers;

public class Divisor {

	public static int divisor_num(int num) {
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int solution(int left, int right) {
		int answer = 0;
		
		for(int i=left;i<=right;i++) {
			if(divisor_num(i)%2==0) {
				answer+=i;
			}else {
				answer-=i;
			}
			System.out.println(answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int left=13;
		int right=17;
		
		solution(left, right);
	}
}
