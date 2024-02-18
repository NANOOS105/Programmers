import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false){
                list.add(todo_list[i]);
            }
        }  
        answer = new String[list.size()];
        int i = 0;
        for( String s : list){
            answer[i++] = s;
        }
        return answer;
    }
}