import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        String temp = "";
        
        for(int i=0;i<my_string.length();i++){
            temp = my_string.substring(i);
            arr.add(temp);
        }
        
         String[] answer = new String[arr.size()];
        for(int i =0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}