import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //대문자 확인
        for(int i = 65; i <= 90; i++){
            int num = 0;
            for(int j=0; j<my_string.length();j++){
            if((int)(my_string.charAt(j)) == i){
                num++;
                }
             }
                list.add(num);
        }
        //소문자확인
         for(int i = 97; i <= 122; i++){
             int num = 0;
            for(int j=0; j<my_string.length();j++){
            if((int)(my_string.charAt(j)) == i){
                num++;
                }
             }
                list.add(num);
         }
        //리스트값 배열에 넣기
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
        }
    }
