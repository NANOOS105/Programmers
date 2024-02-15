import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        //my_string char배열로 만들기 
        char[] arr = my_string.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        //삭제 원소 0으로 만들기      
       for(int i=0; i<indices.length;i++){
            arr[indices[i]] = 0;     
         }
         //for문으로 0이 아니면 리스트에 추가
        for(int i = 0; i<my_string.length();i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        //create object of StringBuilder class
        StringBuilder sb = new StringBuilder();
        
        //Append characters one by one
        for(Character ch : list){
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}