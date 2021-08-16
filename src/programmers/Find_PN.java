package programmers;

public class Find_PN {

	public int solution(int n) {
		int answer = 0;
        
        boolean[] check = new boolean[n+1];
        
        // 에라토스테네스의 체
        check[0] = check[1] = true;
        
        for(int i = 2; i <= n; i++){
            if(check[i] == false){
                if(i >= 2)
                    answer++;
                for(int j = i+i; j <= n; j+=i)
                    check[j] = true;
            }
        }
        
        return answer;
    }
}
