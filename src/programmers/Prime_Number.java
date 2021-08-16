package programmers;

public class Prime_Number {

	public boolean prime_num(int num) {		
		boolean result = false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}else {
				result=true;
			}
		}
		
		return result;
	}
	
	public int solution(int[] nums) {
		int answer=0;
		int num;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					num=nums[i]+nums[j]+nums[k];
					
					if(prime_num(num)) {
						answer++;
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

	}

}
