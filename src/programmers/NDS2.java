package programmers;

public class NDS2 {

	static boolean[][] chess=new boolean[8][8];
	
	public static int solution(String[] bishops) {
        int answer = 64;
        
        for(int i=0;i<bishops.length;i++) {
        	movement(bishops[i]);
        }
        
        for(int i=0;i<8;i++) {
        	for(int j=0;j<8;j++) {
        		if(chess[i][j]) {
        			answer--;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void movement(String s) {
		int h = 0;
		
		if(s.charAt(0)=='A') {
			h=0;
		}else if(s.charAt(0)=='B') {
			h=1;
		}else if(s.charAt(0)=='C') {
			h=2;
		}else if(s.charAt(0)=='D') {
			h=3;
		}else if(s.charAt(0)=='E') {
			h=4;
		}else if(s.charAt(0)=='F') {
			h=5;
		}else if(s.charAt(0)=='G') {
			h=6;
		}else if(s.charAt(0)=='H') {
			h=7;
		}
		
		int l=Integer.parseInt(Character.toString(s.charAt(1)))-1;
		//System.out.println(h);
		//System.out.println(l);
		
		int a=h;
		int b=l;
		while(a>=0 && b>=0) {
			chess[a][b]=true;
			
			a--;
			b--;
		}
		
		a=h;
		b=l;
		while(a>=0 && b<=7) {
			chess[a][b]=true;
			
			a--;
			b++;
		}
		
		a=h;
		b=l;
		while(a<=7 && b>=0) {
			chess[a][b]=true;
			
			a++;
			b--;
		}
		
		a=h;
		b=l;
		while(a<=7 && b<=7) {
			chess[a][b]=true;
			
			a++;
			b++;
		}
	}
	
	public static void main(String[] args) {
		String[] bishops= {"C6", "A4", "E5"};
		
		System.out.println(solution(bishops));
	}

}
