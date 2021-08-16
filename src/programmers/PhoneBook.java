package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PhoneBook {
	public boolean solution(String[] phone_book) {
		ArrayList<String> tel=new ArrayList<>();
		boolean answer = false;
		
		Arrays.sort(phone_book);

		for(String telnum:phone_book) {
			tel.add(telnum);
		}		

		Iterator<String> it=tel.iterator();
		while(it.hasNext()) {
			String str=it.next();
			
			for(String num:phone_book) {
				if(!(str.equals(num)) && str.startsWith(num)) {
					answer=false;
					return answer;
				} else answer=true;

			}
		}

		return answer;
	}
}
