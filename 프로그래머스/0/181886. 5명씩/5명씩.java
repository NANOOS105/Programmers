import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for(int i= 0; i<names.length; i += 5){
            list.add(names[i]);
        }
        
        answer = new String[list.size()];
        int i = 0;
        for( String s : list){
            answer[i++] = s;
        }
        return answer;
    }
}