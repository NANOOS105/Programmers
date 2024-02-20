import java.util.*;

class Solution {
    public ArrayList<String> solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        
        for(int i=0;i<answer.length;i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        return list;
    }
}