package programmers;

public class SecretMap {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		String[][] result=new String[n][n];
		
		int num1,num2;
		for(int i=0;i<n;i++) {
			num1=arr1[i];
			num2=arr2[i];
			answer[i]="";
			
			for(int j=n-1;j>=0;j--) {
				if(num1%2==0 && num2%2==0) {
					result[i][j]=" ";
					num1/=2;
					num2/=2;
				}else {
					result[i][j]="#";
					num1/=2;
					num2/=2;
				}
			}
			
			for(int j=0;j<n;j++) {
				answer[i]+=result[i][j];
			}
		}
		
		return answer;
	}


	public static void main(String[] args) {
		int n=6;
		int[] arr1= {46, 33, 33 ,22, 31, 50};
		int[] arr2= {27 ,56, 19, 14, 14, 10};
		
		String[] answer=solution(n,arr1,arr2);
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
