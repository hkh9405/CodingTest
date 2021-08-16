package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Queries {

	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int[][] num=new int[rows][columns];
        
        int z=1;
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		num[i][j]=z;
        		z++;
        	}
        }
        
        int num1;
        int num2;
        List<Integer> list;
        for(int i=0;i<queries.length;i++) {
        	list=new ArrayList<Integer>();
        	num1=num[queries[i][0]-1][queries[i][1]-1];
        	
        	for(int j=queries[i][1];j<queries[i][3];j++) {
        		num2=num[queries[i][0]-1][j];
        		num[queries[i][0]-1][j]=num1;
        		num1=num2;
        		list.add(num[queries[i][0]-1][j]);
        	}
        	
        	for(int j=queries[i][0];j<queries[i][2];j++) {
        		num2=num[j][queries[i][3]-1];
        		num[j][queries[i][3]-1]=num1;
        		num1=num2;
        		list.add(num[j][queries[i][3]-1]);
        	}
        	
        	for(int j=queries[i][3]-2;j>=queries[i][1]-1;j--) {
        		num2=num[queries[i][2]-1][j];
        		num[queries[i][2]-1][j]=num1;
        		num1=num2;
        		list.add(num[queries[i][2]-1][j]);
        	}
        	
        	for(int j=queries[i][2]-2;j>=queries[i][0]-1;j--) {
        		num2=num[j][queries[i][1]-1];
        		num[j][queries[i][1]-1]=num1;
        		num1=num2;
        		list.add(num[j][queries[i][1]-1]);
        	}
        	
        	Collections.sort(list);
        	
        	answer[i]=list.get(0);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int rows=6;
		int columns=6;
		int[][] queries={{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		int[] answer=solution(rows, columns, queries);
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
		
	}

}
