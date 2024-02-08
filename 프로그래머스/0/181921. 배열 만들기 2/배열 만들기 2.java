import java.util.*;

class Solution {
    
	public int[] solution(int l, int r) {
		int[] answer = {};
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			int num = 0;
			String checkNumber = String.valueOf(i);
			int numberLength = checkNumber.length();
			for (int j = 0; j < checkNumber.length(); j++) {
				if (checkNumber.charAt(j) == '5' || checkNumber.charAt(j) == '0') {
					num++;
				}
			}
			if(num==checkNumber.length()) {
				arr.add(i);
			}
		}
		if (arr.size() == 0) {
			answer = new int[]{ -1 }; 
			return answer;
		} else {
			answer = new int[arr.size()];
			for (int i = 0; i < arr.size(); i++) {
				answer[i] = arr.get(i);
			}
		}
		return answer;
	}
}
